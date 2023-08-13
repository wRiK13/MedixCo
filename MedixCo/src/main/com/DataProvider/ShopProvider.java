package com.DataProvider;

import com.Dao.FactoryProvider;
import com.Entities.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ShopProvider
{
    static Shop shop1 = new Shop(),
            shop2 = new Shop(),
            shop3 = new Shop(),
            shop4 = new Shop(),
            shop5 = new Shop(),
            shop6 = new Shop(),
            shop7 = new Shop(),
            shop8 = new Shop(),
            shop9 = new Shop(),
            shop10 = new Shop();

    public static void main(String[] args)
    {
        System.out.println("Project started....");
        SessionFactory factory = FactoryProvider.getFactory();
// SessionFactory factory = new Configuration().configure("config.xml").buildSessionFactory();

// 1ST SHOP
        shop1.setName("Dumdum MedixCo");

// 2ND SHOP
        shop2.setName("Tollugunge MedixCo");

//3RD SHOP
        shop3.setName("NewTown MedixCo");

//4TH SHOP
        shop4.setName("Behala MedixCo");

//5TH SHOP
        shop5.setName("Parkstreet MedixCo");

//6TH SHOP
        shop6.setName("Sealdah MedixCo");

//7TH SHOP
        shop7.setName("Rashbehari MedixCo");

//8TH SHOP
        shop8.setName("Barasat MedixCo");

//9TH SHOP
        shop9.setName("Howrah MedixCo");

//10TH SHOP
        shop10.setName("Bidhannagar MedixCo");

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(shop1);
        session.save(shop2);
        session.save(shop3);
        session.save(shop4);
        session.save(shop5);
        session.save(shop6);
        session.save(shop7);
        session.save(shop8);
        session.save(shop9);
        session.save(shop10);
        tx.commit();

// session.close();
// factory.close();
    }

}