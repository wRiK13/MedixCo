package com.Servlets;

import com.Dao.FactoryProvider;
import com.Entities.Confirmation;
import com.Entities.DeliveryPartner;
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

@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public FeedbackServlet()
    {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            int orderId = Integer.parseInt(request.getParameter("order-id").trim());

            Session session = FactoryProvider.getFactory().openSession();

// fetch the order record first
            Query query = session.createQuery("from OrderMed where order_id = :x");
            query.setParameter("x", orderId);
            List<OrderMed> orderMedList = query.list();

// fetching the orderconfirmation record to get delivery person
            SQLQuery queryDeliveryPartner = session.createSQLQuery("SELECT * FROM Confirmation WHERE order_id = :y");
            queryDeliveryPartner.setParameter("y", orderId);
            queryDeliveryPartner.addEntity(Confirmation.class);
            List<Confirmation> ConfirmationList = queryDeliveryPartner.list();

            OrderMed orderMed = orderMedList.get(0);
            DeliveryPartner person = ConfirmationList.get(0).getDeliverypartner();
            session.close();

            request.setAttribute("order", orderMed);
            request.setAttribute("person", person);
            RequestDispatcher rd = request.getRequestDispatcher("feedback.jsp");
            rd.forward(request, response);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}