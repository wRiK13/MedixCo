package com.Servlets;

import com.Dao.Cart;
import com.Dao.CartProvider;
import com.Dao.FactoryProvider;
import com.Entities.Medicine;
import org.hibernate.Session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RemoveMedServlet")
public class RemoveMedServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public RemoveMedServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            int medId = Integer.parseInt(request.getParameter("medId").trim());

            Cart cart = CartProvider.getCart();
            cart.removeMedicine(medId);

            Session session = FactoryProvider.getFactory().openSession();
            Medicine removedMed = session.get(Medicine.class, medId);
            session.close();

            request.setAttribute("medName", removedMed.getName());

// if the cart gets empty the user is redirected to remove_meds1 else remove_meds2
            if (cart.getMedicineMap().isEmpty())
            {
                RequestDispatcher rd = request.getRequestDispatcher("EmptyCart.jsp");
                rd.forward(request, response);
            }
            else
            {
                RequestDispatcher rd = request.getRequestDispatcher("remove.jsp");
                rd.forward(request, response);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}