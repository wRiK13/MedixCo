package com.Servlets;

import com.Dao.CustomerProvider;
import com.Dao.FactoryProvider;
import com.Entities.Address;
import com.Entities.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SaveAddressServlet")
public class SaveAddressServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public SaveAddressServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            Session session = FactoryProvider.getFactory().openSession();

            String houseNo = request.getParameter("houseNo").trim(),
                    street = request.getParameter("street").trim(),
                    block = request.getParameter("block").trim(),
                    locality = request.getParameter("locality").trim(),
                    landmark = request.getParameter("landmark").trim(),
                    city = request.getParameter("city").trim(),
                    pincode = request.getParameter("pincode").trim(),
                    mobilenumber = request.getParameter("mobilenumber").trim();

            Customer currentCustomer = CustomerProvider.getCustomer();
            Address address = new Address();

// set the normal address fields
            address.setHouseNumber(houseNo);
            address.setStreetName(street);
            address.setBlock(block);
            address.setLocality(locality);
            address.setLandmark(landmark);
            address.setCity(city);
            address.setPincode(Integer.parseInt(pincode));
            address.setMobilenumber((int) Long.parseLong(mobilenumber));
            address.setAddressType("home");


//            address.setHouseNumber(houseNo);
//            address.setStreetName(street);
//            address.setLocality(locality);
//            address.setCity(city);
//            address.setPincode(Integer.parseInt(pincode));
//            address.setLandmark(landmark);
//
//            address.setAddressType("home");

// update the address list of the user
/*List<Address> userAddressList = currentUser.getAddressList();
userAddressList.add(address);
currentUser.setAddressList(userAddressList);*/

// save the user with the updated fields to address entity
            address.setCustomer(currentCustomer);

// make changes to the database
            Transaction tx = session.beginTransaction();

            session.save(address);
            /* session.update(currentUser); */

            tx.commit();
            session.close();


            RequestDispatcher rd = request.getRequestDispatcher("AddressSelect.jsp");
            rd.forward(request, response);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}