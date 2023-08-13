package com.Servlets;

import com.Dao.Cart;
import com.Dao.CartProvider;
import com.Dao.FactoryProvider;
import com.Entities.Medicine;
import com.Entities.OrderMed;
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

@WebServlet("/ReorderServlet")
public class ReorderServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ReorderServlet()
    {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            int orderId = Integer.parseInt(request.getParameter("order-id"));

// fetch the order
            Session session = FactoryProvider.getFactory().openSession();
            OrderMed orderMed = session.get(OrderMed.class, orderId);

// get the string of medicines ordered
            String medicinesOrdered = orderMed.getOrderedMedicines();

// fetch the cart
            Cart cart = CartProvider.getCart();

// extraction of medicine name, the quantity started in the for loop
            String medicineName = "";
            for (int i = 1; i < medicinesOrdered.length() - 1; )
            {
                char ch = medicinesOrdered.charAt(i);
                if (ch != '(')
                {
                    medicineName += ch;
                    i++;
                }
                else
                {
// medicine name and quantity extracted to execute the query
                    medicineName = medicineName.trim();
                    int quantity = Integer.parseInt(String.valueOf(medicinesOrdered.charAt(i + 1)));

                    Query q = (Query) session.createQuery("from Medicine where name = :x");
                    q.setParameter("x", medicineName);
                    List<Medicine> list = q.list();
                    Medicine medicine = list.get(0);

// add the medicines to the cart
                    cart.add(medicine.getMedicineId(), quantity);

// preparation for next iteration
                    i += 4;
                    medicineName = "";
                }
            }

            RequestDispatcher rd = request.getRequestDispatcher("Reorder.jsp");
            rd.forward(request, response);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}