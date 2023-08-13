package com.Servlets;


import com.Dao.*;

import com.Entities.Address;

import com.Entities.Customer;

import com.Entities.OrderMed;

import com.Entities.Shop;

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

import java.util.List;


@WebServlet("/OrderConfirmServlet")

public class OrderConfirmServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    public OrderConfirmServlet() {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

    {

        try

        {

            Session session = FactoryProvider.getFactory().openSession();


            Cart cart = CartProvider.getCart();

            List<String> medicineList = cart.getMedicineList(); // medicines_ordered

            double cartValue = cart.getCartValue(); // cart_value

            Customer customer = CustomerProvider.getCustomer(); // user_id

// Shop shop = ShopProvider.getShop(); // store_id

            Shop shop = ShopProvider.getShop();

// Fetch the delivery option

            String deliveryOption = request.getParameter("delivery-option");


            if (deliveryOption == null || deliveryOption.equals("your-address"))

            {

// fetch the home address of the user if already stored.

                Query query = session.createQuery("from Address where customer_Id = :x and addressType = :y");

                query.setParameter("x", customer.getCustId());

                query.setParameter("y", "home");

                List<Address> addressList = query.list();


// the below scenario shows that the user hasn't ordered anything in the past to his house

// in simple words, the home address of the user in not in our database

                if (addressList.isEmpty())

                {

                    RequestDispatcher rd = request.getRequestDispatcher("homeaddress.jsp");

                    rd.forward(request, response);

                }

// in this scenario the user has ordered something in the past to be delivered to his/her house

// in simple words, we've the home address of the user

                else

                {

                    Address customerHomeAddress = addressList.get(0);


// fill out the orders table

                    OrderMed orderMed = new OrderMed();

                    orderMed.setCartValue(cartValue);

                    orderMed.setOrderedMedicines(medicineList.toString());

                    orderMed.setAddress(customerHomeAddress);

                    orderMed.setShop(shop);

                    orderMed.setCustomer(customer);


                    Transaction tx1 = session.beginTransaction();

                    session.save(orderMed);

                    tx1.commit();

                }

            }

// here the order needs to be delivered to a different address

            else

            {

// String houseNo = request.getParameter("houseNo").trim(),
//
// block = request.getParameter("block").trim(),
//
// locality = request.getParameter("locality").trim(),
//
// city = request.getParameter("city").trim(),
//
// landmark = request.getParameter("landmark").trim(),
//
// pincode = request.getParameter("pincode").trim(),
//
// phoneNumber = request.getParameter("phoneNumber").trim();

                String houseNo = request.getParameter("houseNo").trim(),
                        street = request.getParameter("street").trim(),
                        block = request.getParameter("block").trim(),
                        locality = request.getParameter("locality").trim(),
                        landmark = request.getParameter("landmark").trim(),
                        city = request.getParameter("city").trim(),
                        pincode = request.getParameter("pincode").trim(),
                        mobilenumber = request.getParameter("mobilenumber").trim();


// make a new address entry for the user in the address table

                Address otherAddress = new Address();


// set the normal address fields

// otherAddress.setHouseNumber(houseNo);
//
// otherAddress.setBlock(block);
//
// otherAddress.setLocality(locality);
//
// otherAddress.setCity(city);
//
// otherAddress.setLandmark(landmark);
//
// otherAddress.setPincode(Integer.parseInt(pincode));
//
// otherAddress.setMobilenumber(Integer.parseInt(phoneNumber));
//
// otherAddress.setAddressType("other");
// otherAddress.setCustomer(customer);

                otherAddress.setHouseNumber(houseNo);
                otherAddress.setStreetName(street);
                otherAddress.setBlock(block);
                otherAddress.setLocality(locality);
                otherAddress.setLandmark(landmark);
                otherAddress.setCity(city);
                otherAddress.setPincode(Integer.parseInt(pincode));
                otherAddress.setMobilenumber(Integer.parseInt(mobilenumber));
                otherAddress.setAddressType("other");
                otherAddress.setCustomer(customer);




// fill out the orders table

                OrderMed orderMed = new OrderMed();

                orderMed.setCartValue(cartValue);

                orderMed.setOrderedMedicines(medicineList.toString());

                orderMed.setAddress(otherAddress);

                orderMed.setShop(shop);

                orderMed.setCustomer(customer);


                Transaction tx2 = session.beginTransaction();

                session.save(otherAddress);

                session.save(orderMed);

                tx2.commit();

            }


            session.close();

            RequestDispatcher rd = request.getRequestDispatcher("Payment.jsp");

            rd.forward(request, response);

        }

        catch (Exception e)

        {

            e.printStackTrace();

        }

    }

}