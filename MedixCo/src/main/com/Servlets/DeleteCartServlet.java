package com.Servlets;

import com.Dao.Cart;

import com.Dao.CartProvider;
import com.Dao.ShopProvider;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteCartServlet")
public class DeleteCartServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    public DeleteCartServlet()
    {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            Cart cart = CartProvider.getCart();
            cart.clearCart();

            response.sendRedirect("EmptyCart.jsp");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
