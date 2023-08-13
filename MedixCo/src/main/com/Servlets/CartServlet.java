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

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    public CartServlet()
    {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            int medId = Integer.parseInt(request.getParameter("medId").trim());

            Session session = FactoryProvider.getFactory().openSession();
            Medicine medicine = session.get(Medicine.class, medId);
            session.close();

            Cart cart = CartProvider.getCart();
            cart.add(medId, quantity);
            // Set the cart object in the request attribute before forwarding to Cart.jsp
            request.setAttribute("cart", cart);
            RequestDispatcher rd = request.getRequestDispatcher("Cart.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}