package com.DataProvider;

import com.Entities.Medicine;
import com.Entities.Shop;
import com.Entities.Stock;
import com.Dao.FactoryProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Date;

public class MainClass2
{
    public static void main(String[] args)
    {
        SessionFactory factory = FactoryProvider.getFactory();

        Session session = factory.openSession();
        Medicine Rantac150 = session.get(Medicine.class, 2),
                Sorbiline = session.get(Medicine.class, 3);

        Shop BidhannagarMedixCo = session.get(Shop.class, 1);

        Stock Rantac150Stock = new Stock();
        Rantac150Stock.setBatchNumber("SID7890AF");
        Rantac150Stock.setMedicine(Rantac150);
        Rantac150Stock.setShop(BidhannagarMedixCo);
        Rantac150Stock.setQuantity(23);
        Rantac150Stock.setManufacturingDate(Date.valueOf("2023-03-01"));
        Rantac150Stock.setExpiryDate(Date.valueOf("2024-05-31"));

        Stock SorbilineStock = new Stock();
        SorbilineStock.setBatchNumber("SID8901AG");
        SorbilineStock.setMedicine(Sorbiline);
        SorbilineStock.setShop(BidhannagarMedixCo);
        SorbilineStock.setQuantity(90);
        SorbilineStock.setManufacturingDate(Date.valueOf("2022-12-31"));
        SorbilineStock.setExpiryDate(Date.valueOf("2024-11-01"));


        // new medicines
        Medicine Azithral500 = new Medicine();
        Azithral500.setName("Azithral 500 Tablet");
        Azithral500.setType("Tablet");
        Azithral500.setCompanyName("Alembic Pharmaceuticals Ltd");
        Azithral500.setPrice(185);

        Stock Azithral500Stock = new Stock();
        Azithral500Stock.setBatchNumber("SID9012AH");
        Azithral500Stock.setMedicine(Azithral500);
        Azithral500Stock.setShop(BidhannagarMedixCo);
        Azithral500Stock.setQuantity(75);
        Azithral500Stock.setManufacturingDate(Date.valueOf("2022-11-30"));
        Azithral500Stock.setExpiryDate(Date.valueOf("2025-04-01"));

        Transaction tx = session.beginTransaction();

        session.save(Rantac150Stock);
        session.save(SorbilineStock);

        session.save(Azithral500);
        session.save(Azithral500Stock);

        tx.commit();
        session.close();
        factory.close();
    }
}