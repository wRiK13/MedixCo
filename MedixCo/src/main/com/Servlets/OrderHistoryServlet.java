package com.Servlets;

import com.Dao.CustomerProvider;
import com.Dao.FactoryProvider;
import com.Entities.Customer;
import com.Entities.OrderMed;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/OrderHistoryServlet")
public class OrderHistoryServlet extends HttpServlet
{

    private static final long serialVersionUID = 1L;

    public OrderHistoryServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            Session s = FactoryProvider.getFactory().openSession();

            Query getQuery = (Query) s.createQuery("from OrderMed ");
            List<OrderMed> orderMedHistoryList = getQuery.list();

            if (orderMedHistoryList.isEmpty())
            {
                response.setContentType("text/html");

// Create JavaScript code to display a message box
                String message = "You have not ordered anything yet!";
                String script = "alert('" + message + "');";

// Include the JavaScript code in the servlet response
                response.getWriter().println("<script>" + script + "</script>");
            }
            else
            {
                Session session = FactoryProvider.getFactory().openSession();
                Customer customer = CustomerProvider.getCustomer();
                SQLQuery q = session.createSQLQuery("SELECT * FROM OrderMed WHERE customer_id = :x ORDER BY order_id DESC");
//Query q = (Query) session.createQuery("from Order where user_id = :x");
                q.setParameter("x", customer.getCustId());
                q.addEntity(OrderMed.class);
                List<OrderMed> orderMedList = q.list();

                request.setAttribute("orderList", orderMedList);
                RequestDispatcher rd = request.getRequestDispatcher("OrderHistory.jsp");
                rd.forward(request, response);
            }

            s.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}