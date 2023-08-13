
package com.Servlets;


import com.Dao.*;

import com.Entities.*;

import org.hibernate.SQLQuery;

import org.hibernate.Session;

import org.hibernate.Transaction;

import org.hibernate.query.Query;


import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.sql.Timestamp;

import java.util.Calendar;

import java.util.List;

import java.util.Map;

import java.util.Random;


@WebServlet("/PaymentServlet")

public class PaymentServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;


    public PaymentServlet()

    {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

    {

        try

        {

            String paymentMethod = request.getParameter("payment-method");

            int counter = MaximumAttemptsProvider.getMaximumAttempts();


            if (paymentMethod.equals("cash"))

            {

                DeliveryPartner partner = confirmOrder(paymentMethod);


                request.setAttribute("partner", partner);

                RequestDispatcher rd = request.getRequestDispatcher("OrderPlaced.jsp");

                rd.forward(request, response);

            }

// payment method is through card

            else

            {

                String enteredPassword = request.getParameter("login-password");


                String customerPassword = CustomerProvider.getCustomer().getPassword();

// if the password matches the payment is accepted

                if (enteredPassword.equals(customerPassword) && counter < 3)

                {

                    DeliveryPartner partner = confirmOrder(paymentMethod);


                    request.setAttribute("partner", partner);

                    RequestDispatcher rd = request.getRequestDispatcher("OrderPlaced.jsp");

                    rd.forward(request, response);

                }

// the entered password is wrong

                else if (counter < 3)

                {

                    MaximumAttemptsProvider.IncreaseAttempts();

                    response.setContentType("text/html");


// Create JavaScript code to display a message box

                    String message = "You have entered wrong password. You have a maximum of 3 attempts. If you are facing difficulty in transaction, You can also use cash as payment option.";

                    String script = "alert('" + message + "');";


// Include the JavaScript code in the servlet response

                    response.getWriter().println("<script>" + script + "</script>");

                }

// the order is cancelled because of the failed transaction and used all the available attempts

                else

                {

                    cancelOrder();


// reset everything back

                    CartProvider.setCart(null);

                    ShopProvider.setShop(null);

// ShopProvider.setShop(null);

                    CustomerProvider.setCustomer(null);


                    RequestDispatcher rd = request.getRequestDispatcher("failed_order.jsp");

                    rd.forward(request, response);

                }

            }

        }

        catch (Exception e)

        {

            e.printStackTrace();

        }

    }

    private DeliveryPartner confirmOrder(String paymentMethod)

    {

        Session session = FactoryProvider.getFactory().openSession();

// retrieve the last order

        Query q = session.createQuery("from OrderMed");

        List<OrderMed> orderMedList = q.list();


// fetch the last order inserted into the table

        OrderMed orderMed = orderMedList.get(orderMedList.size() - 1);


        Confirmation orderConfirmation = new Confirmation();

        orderConfirmation.setOrder(orderMed);

        orderConfirmation.setPaymentMode(paymentMethod);

        orderConfirmation.setStatus("In Progress");


        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

// Create a Calendar instance

        Calendar calendar = Calendar.getInstance();


// Set the Calendar time to the current timestamp

        calendar.setTime(currentTimestamp);


// Add 2 hours to the Calendar

        calendar.add(Calendar.HOUR_OF_DAY, 2);


// Get the updated timestamp

        Timestamp updatedTimestamp = new Timestamp(calendar.getTimeInMillis());

        orderConfirmation.setOrderDateTime(currentTimestamp);

        orderConfirmation.setDeliveryDate(updatedTimestamp);


// assign a delivery person

        Random random = new Random();

        int randomInt = random.nextInt(3) + 1;

        DeliveryPartner partner = session.get(DeliveryPartner.class, randomInt);

        orderConfirmation.setDeliverypartner(partner);


        Transaction tx = session.beginTransaction();

        session.save(orderConfirmation);

        tx.commit();


        session.close();


// update the stock

        updateStock();


        return partner;

    }


    private void cancelOrder()

    {

        Session session = FactoryProvider.getFactory().openSession();

// retrieve the last order

        Query q = session.createQuery("from OrderMed ");

        List<OrderMed> orderMedList = q.list();


// fetch the last order inserted into the table

        OrderMed orderMed = orderMedList.get(orderMedList.size() - 1);


        Confirmation orderConfirmation = new Confirmation();

        orderConfirmation.setOrder(orderMed);

        orderConfirmation.setPaymentMode("N.A.");

        orderConfirmation.setStatus("Cancelled");


        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

        orderConfirmation.setDeliveryDate(currentTimestamp);


        Transaction tx = session.beginTransaction();

        session.save(orderConfirmation);

        tx.commit();


        session.close();

    }


    private void updateStock()

    {

        Session session = FactoryProvider.getFactory().openSession();

// Shop shop = ShopProvider.getShop();

        Shop shop = com.Dao.ShopProvider.getShop();

        Cart cart = CartProvider.getCart();

        Map<Integer, Integer> medicineMap = cart.getMedicineMap();


        for (Map.Entry<Integer, Integer> entry : medicineMap.entrySet())

        {

            int medicineId = entry.getKey();

            int quantityOrdered = entry.getValue();


            SQLQuery q = session.createSQLQuery("SELECT * FROM stock WHERE med_id = :x AND shop_id = :y");

            q.setParameter("x", medicineId);

            q.setParameter("y", shop.getShopId());

            q.addEntity(Stock.class);

            List list = q.list();

            Stock stock = (Stock) list.get(0);


            long initialQuantity = stock.getQuantity();

            stock.setQuantity(initialQuantity - quantityOrdered);

            Transaction tx = session.beginTransaction();

            session.update(stock);

            tx.commit();

        }

        session.close();

    }

}