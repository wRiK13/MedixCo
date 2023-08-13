package com.Servlets;

import com.Dao.CustomerProvider;
import com.Dao.FactoryProvider;
import com.Entities.Customer;
import com.Entities.Shop;
import org.hibernate.Query;
import org.hibernate.Session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String email_id = request.getParameter("email");
            String password = request.getParameter("password");

            Session session = FactoryProvider.getFactory().openSession();

            String query = "from Customer where mailId = :x and password = :y";
            Query q = (Query) session.createQuery(query);
            q.setParameter("x", email_id);
            q.setParameter("y", password);
            List<Customer> customerList = q.list();

//another query to check if user exists in the database and check if the entered password is right or wrong
            String query2 = "from Customer where mailId = :x";
            Query q2 = (Query) session.createQuery(query2);
            q2.setParameter("x", email_id);
            List<Customer> customerList2 = q2.list();

            if ((customerList.isEmpty()) && (!customerList2.isEmpty())) {
                PrintWriter out = response.getWriter();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('You have entered the password wrong');");
                out.println("location='index.jsp';");
                out.println("</script>");
            }


            if (customerList.isEmpty() && customerList2.isEmpty()) {
                PrintWriter out = response.getWriter();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('You have not registered at our site');");
                out.println("location='Registration.jsp';");
                out.println("</script>");
            } else {

                //to fetch the shop
                Query getQuery = (Query) session.createQuery("from Shop ");
                List<Shop> shopList = (List<Shop>) getQuery.list();

                Customer customer = customerList.get(0);
                CustomerProvider.setCustomer(customer); // saving the user for later use
                request.setAttribute("customer", customer);
                request.setAttribute("shopList", shopList);
                RequestDispatcher rd = request.getRequestDispatcher("SelectShop.jsp");
                rd.forward(request, response);
            }

            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}