package com.Servlets;

import com.Dao.CustomerProvider;
import com.Dao.FactoryProvider;
import com.Dao.ShopProvider;
import com.Entities.Customer;
import com.Entities.Medicine;
import com.Entities.Shop;
import com.Entities.Stock;
import org.hibernate.Query;
import org.hibernate.Session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HomeServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            String shopName = request.getParameter("shop");
//            Session session = FactoryProvider.getFactory().openSession();
            Session session = FactoryProvider.getFactory().openSession();

            //fetching the shop & its and its details
            Query queryShop = session.createQuery("from Shop where name =:x");
            queryShop.setParameter("x", shopName);
            List<Shop> shopList = queryShop.list();
            Shop shop = shopList.get(0);
            ShopProvider.setShop(shop);

            //fetch medicines & stock details
            List<Stock> stockList = shop.getStockList();
            List<Medicine> medicineList = new ArrayList<>();
            for (Stock stock : stockList) {
                if (stock.getQuantity() > 0) {
                    Medicine medicine = stock.getMedicine();
                    medicineList.add(medicine);
                }
            }

            Customer customer = CustomerProvider.getCustomer();

            request.setAttribute("customer", customer);
            request.setAttribute("shop", shop);
            request.setAttribute("medicineList", medicineList);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Home.jsp");
            requestDispatcher.forward(request, response);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}