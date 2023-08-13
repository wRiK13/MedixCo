package com.Servlets;

import com.Dao.CustomerProvider;
import com.Dao.FactoryProvider;
import com.Entities.Customer;
import com.Entities.Shop;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Customer customer;

    public RegistrationServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try {
            String name = request.getParameter("name");
            String mobile = String.valueOf(request.getParameter("mobile"));
            String email = request.getParameter("emailId");
            String dateOfBirth = request.getParameter("dateOfBirth");
            String password = request.getParameter("password");

            System.out.println("Name: " + name + ", mobile" + mobile + ", email" + email + ", dateOfBirth" + dateOfBirth + "password" + password);

            Session session = FactoryProvider.getFactory().openSession();

            String query = "from Customer where phone_number =:x";
            Query q = session.createQuery(query);
            q.setParameter("x", mobile);
            List<Customer> customerList = q.list();

            if (customerList.isEmpty())
            {
                Transaction tx = session.beginTransaction();

                customer = new Customer();
                customer.setCust_name(name);
                customer.setPhone_number(String.valueOf(mobile));
                customer.setMailId(email);
                customer.setDateofbirth(dateOfBirth);
                customer.setPassword(password);

                session.save(customer);
                tx.commit();
                CustomerProvider.setCustomer(customer);

//fetch stores
                Query getQuery = session.createQuery("from Shop ");
                List<Shop> shopList = getQuery.list();

                request.setAttribute("customer", customer);
                request.setAttribute("shopList", shopList);
                RequestDispatcher rd = request.getRequestDispatcher("SelectShop.jsp");
                rd.forward(request, response);
            }
            else
            {
                PrintWriter out = response.getWriter();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('You are already registered with us!');");
                out.println("location='index.jsp';");
                out.println("</script>");
            }
            session.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public Customer getCustomer()
    {
        return customer;
    }
}