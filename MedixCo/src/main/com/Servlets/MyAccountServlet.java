package com.Servlets;

import com.Entities.Customer;
import com.Dao.CustomerProvider;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/MyAccount")
public class MyAccountServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Customer loggedInCustomer = (Customer) session.getAttribute("loggedInCustomer");

        if (loggedInCustomer != null) {
            // Fetch additional customer details from the CustomerProvider, if required
            Customer customer = CustomerProvider.getCustomer();

            // Pass the customer object to the JSP page
            request.setAttribute("customer", customer);

            // Forward the request to the JSP page for rendering
            request.getRequestDispatcher("MyAccount.jsp").forward(request, response);
        } else {
            // Handle the case when no logged-in customer found
            // You can redirect to a login page or display an error message
            response.sendRedirect("index.jsp");
        }
    }
}
