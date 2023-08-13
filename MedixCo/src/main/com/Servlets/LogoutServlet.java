package com.Servlets;

import com.Dao.CartProvider;
import com.Dao.CustomerProvider;
import com.Dao.ShopProvider;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public LogoutServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
// set all the properties to their initial state
            CartProvider.setCart(null);
            ShopProvider.setShop(null);
            CustomerProvider.setCustomer(null);

// redirect to index.jsp, the first page of the website
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}