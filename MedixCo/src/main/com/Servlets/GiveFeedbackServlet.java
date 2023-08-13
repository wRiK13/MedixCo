package com.Servlets;

import com.Dao.FactoryProvider;
import com.Entities.DeliveryPartner;
import com.Entities.Feedback;
import com.Entities.OrderMed;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GiveFeedbackServlet")
public class GiveFeedbackServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public GiveFeedbackServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            int orderId = Integer.parseInt(request.getParameter("orderId"));
            int partnerId = Integer.parseInt(request.getParameter("partnerId"));
            double rating = Double.parseDouble(request.getParameter("rating"));
            String comment = request.getParameter("comment");

// Retrieve the order and delivery person objects
            Session session = FactoryProvider.getFactory().openSession();
            OrderMed orderMed = session.get(OrderMed.class, orderId);
            DeliveryPartner partner = session.get(DeliveryPartner.class, partnerId);

            System.out.println("*******************************");
            System.out.println("Delivery Partner: " + partner.getName());

            Feedback feedback = new Feedback();
            feedback.setOrder(orderMed);
            feedback.setDeliveryPartner(partner);
            feedback.setRatings(rating);
            feedback.setComment(comment);

            Transaction tx = session.beginTransaction();
            session.save(feedback);
            tx.commit();

            session.close();

            RequestDispatcher rd = request.getRequestDispatcher("Afterfeedback.jsp");
            rd.forward(request, response);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}