package com.DataProvider;

import com.Entities.Medicine;
import com.Entities.Stock;
import com.Entities.Shop;
import com.Dao.FactoryProvider;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;

public class MainClass3
{
    public static void main(String[] args)
    {
        Session session = FactoryProvider.getFactory().openSession();
        Shop RashbehariMedixCo = session.get(Shop.class, 1);

        Medicine EcosprinGold40 = new Medicine();
        EcosprinGold40.setName("Ecosprin Gold 40 Capsule");
        EcosprinGold40.setType("Capsule");
        EcosprinGold40.setCompanyName("USV Ltd");
        EcosprinGold40.setPrice(206.08);

        Stock EcosprinGold40Stock = new Stock();
        EcosprinGold40Stock.setBatchNumber("SID0123AI");
        EcosprinGold40Stock.setMedicine(EcosprinGold40);
        EcosprinGold40Stock.setShop(RashbehariMedixCo);
        EcosprinGold40Stock.setQuantity(210);
        EcosprinGold40Stock.setManufacturingDate(Date.valueOf("2023-01-31"));
        EcosprinGold40Stock.setExpiryDate(Date.valueOf("2024-12-30"));

        Transaction tx = session.beginTransaction();

        session.save(EcosprinGold40);
        session.save(EcosprinGold40Stock);

        tx.commit();
        session.close();
    }
}