package com.DataProvider;


import com.Dao.FactoryProvider;

import com.Entities.Stock;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;


import java.sql.Date;


import static com.DataProvider.MedicineProvider.*;

import static com.DataProvider.ShopProvider.*;


public class StockProvider

{

    static Stock Calpol650mgStock1 = new Stock(),

    Calpol650mgStock2 = new Stock(),

    Calpol650mgStock3 = new Stock(),

    Calpol650mgStock4 = new Stock(),

    Calpol650mgStock5 = new Stock(),

    Calpol650mgStock6 = new Stock(),

    Calpol650mgStock7 = new Stock(),

    Calpol650mgStock8 = new Stock(),

    Calpol650mgStock9 = new Stock(),

    Calpol650mgStock10 = new Stock(),

    Famocid40Stock1 = new Stock(),

    Famocid40Stock2 = new Stock(),

    Famocid40Stock3 = new Stock(),

    Famocid40Stock4 = new Stock(),

    Famocid40Stock5 = new Stock(),

    Famocid40Stock6 = new Stock(),

    Famocid40Stock7 = new Stock(),

    Famocid40Stock8 = new Stock(),

    Famocid40Stock9 = new Stock(),

    Famocid40Stock10 = new Stock(),

    PAN40Stock1 = new Stock(),

    PAN40Stock2 = new Stock(),

    PAN40Stock3 = new Stock(),

    PAN40Stock4 = new Stock(),

    PAN40Stock5 = new Stock(),

    PAN40Stock6 = new Stock(),

    PAN40Stock7 = new Stock(),

    PAN40Stock8 = new Stock(),

    PAN40Stock9 = new Stock(),

    PAN40Stock10 = new Stock(),

    Gudcef200Stock1 = new Stock(),

    Gudcef200Stock2 = new Stock(),

    Gudcef200Stock3 = new Stock(),

    Gudcef200Stock4 = new Stock(),

    Gudcef200Stock5 = new Stock(),

    Gudcef200Stock6 = new Stock(),

    Gudcef200Stock7 = new Stock(),

    Gudcef200Stock8 = new Stock(),

    Gudcef200Stock9 = new Stock(),

    Gudcef200Stock10 = new Stock(),

    AscorilLSStock1 = new Stock(),

    AscorilLSStock2 = new Stock(),

    AscorilLSStock3 = new Stock(),

    AscorilLSStock4 = new Stock(),

    AscorilLSStock5 = new Stock(),

    AscorilLSStock6 = new Stock(),

    AscorilLSStock7 = new Stock(),

    AscorilLSStock8 = new Stock(),

    AscorilLSStock9 = new Stock(),

    AscorilLSStock10 = new Stock();


    public static void main(String[] args)

    {

        System.out.println("Project started....");

        SessionFactory factory = FactoryProvider.getFactory();

// SessionFactory factory = new Configuration().configure("config.xml").buildSessionFactory();


// A medicine of the same batch is present in 2 stores but of varying quantities


        Calpol650mgStock1.setBatchNumber("SID2345AA");

        Calpol650mgStock1.setMedicine(m3);

        Calpol650mgStock1.setShop(shop1);

        Calpol650mgStock1.setQuantity(150);

        Calpol650mgStock1.setManufacturingDate(Date.valueOf("2023-02-21"));

        Calpol650mgStock1.setExpiryDate(Date.valueOf("2025-01-31"));


        Calpol650mgStock2.setBatchNumber("SID2345AA");

        Calpol650mgStock2.setMedicine(m3);

        Calpol650mgStock2.setShop(shop2);

        Calpol650mgStock2.setQuantity(150);

        Calpol650mgStock2.setManufacturingDate(Date.valueOf("2023-02-21"));

        Calpol650mgStock2.setExpiryDate(Date.valueOf("2025-01-31"));


        Calpol650mgStock3.setBatchNumber("SID2345AA");

        Calpol650mgStock3.setMedicine(m3);

        Calpol650mgStock3.setShop(shop3);

        Calpol650mgStock3.setQuantity(150);

        Calpol650mgStock3.setManufacturingDate(Date.valueOf("2023-02-21"));

        Calpol650mgStock3.setExpiryDate(Date.valueOf("2025-01-31"));


        Calpol650mgStock4.setBatchNumber("SID2345AA");

        Calpol650mgStock4.setMedicine(m3);

        Calpol650mgStock4.setShop(shop4);

        Calpol650mgStock4.setQuantity(150);

        Calpol650mgStock4.setManufacturingDate(Date.valueOf("2023-02-21"));

        Calpol650mgStock4.setExpiryDate(Date.valueOf("2025-01-31"));


        Calpol650mgStock5.setBatchNumber("SID2345AA");

        Calpol650mgStock5.setMedicine(m3);

        Calpol650mgStock5.setShop(shop5);

        Calpol650mgStock5.setQuantity(150);

        Calpol650mgStock5.setManufacturingDate(Date.valueOf("2023-02-21"));

        Calpol650mgStock5.setExpiryDate(Date.valueOf("2025-01-31"));


        Calpol650mgStock6.setBatchNumber("SID2345AA");

        Calpol650mgStock6.setMedicine(m3);

        Calpol650mgStock6.setShop(shop6);

        Calpol650mgStock6.setQuantity(150);

        Calpol650mgStock6.setManufacturingDate(Date.valueOf("2023-02-21"));

        Calpol650mgStock6.setExpiryDate(Date.valueOf("2025-01-31"));


        Calpol650mgStock7.setBatchNumber("SID2345AA");

        Calpol650mgStock7.setMedicine(m3);

        Calpol650mgStock7.setShop(shop7);

        Calpol650mgStock7.setQuantity(150);

        Calpol650mgStock7.setManufacturingDate(Date.valueOf("2023-02-21"));

        Calpol650mgStock7.setExpiryDate(Date.valueOf("2025-01-31"));


        Calpol650mgStock8.setBatchNumber("SID2345AA");

        Calpol650mgStock8.setMedicine(m3);

        Calpol650mgStock8.setShop(shop8);

        Calpol650mgStock8.setQuantity(150);

        Calpol650mgStock8.setManufacturingDate(Date.valueOf("2023-02-21"));

        Calpol650mgStock8.setExpiryDate(Date.valueOf("2025-01-31"));


        Calpol650mgStock9.setBatchNumber("SID2345AA");

        Calpol650mgStock9.setMedicine(m3);

        Calpol650mgStock9.setShop(shop9);

        Calpol650mgStock9.setQuantity(150);

        Calpol650mgStock9.setManufacturingDate(Date.valueOf("2023-02-21"));

        Calpol650mgStock9.setExpiryDate(Date.valueOf("2025-01-31"));


        Calpol650mgStock10.setBatchNumber("SID2345AA");

        Calpol650mgStock10.setMedicine(m3);

        Calpol650mgStock10.setShop(shop10);

        Calpol650mgStock10.setQuantity(150);

        Calpol650mgStock10.setManufacturingDate(Date.valueOf("2023-02-21"));

        Calpol650mgStock10.setExpiryDate(Date.valueOf("2025-01-31"));


        Famocid40Stock1.setBatchNumber("SID3456AB");

        Famocid40Stock1.setMedicine(m6);

        Famocid40Stock1.setShop(shop1);

        Famocid40Stock1.setQuantity(80);

        Famocid40Stock1.setManufacturingDate(Date.valueOf("2022-12-31"));

        Famocid40Stock1.setExpiryDate(Date.valueOf("2024-11-01"));


        Famocid40Stock2.setBatchNumber("SID3456AB");

        Famocid40Stock2.setMedicine(m6);

        Famocid40Stock2.setShop(shop2);

        Famocid40Stock2.setQuantity(80);

        Famocid40Stock2.setManufacturingDate(Date.valueOf("2022-12-31"));

        Famocid40Stock2.setExpiryDate(Date.valueOf("2024-11-01"));


        Famocid40Stock3.setBatchNumber("SID3456AB");

        Famocid40Stock3.setMedicine(m6);

        Famocid40Stock3.setShop(shop3);

        Famocid40Stock3.setQuantity(80);

        Famocid40Stock3.setManufacturingDate(Date.valueOf("2022-12-31"));

        Famocid40Stock3.setExpiryDate(Date.valueOf("2024-11-01"));


        Famocid40Stock4.setBatchNumber("SID3456AB");

        Famocid40Stock4.setMedicine(m6);

        Famocid40Stock4.setShop(shop4);

        Famocid40Stock4.setQuantity(80);

        Famocid40Stock4.setManufacturingDate(Date.valueOf("2022-12-31"));

        Famocid40Stock4.setExpiryDate(Date.valueOf("2024-11-01"));


        Famocid40Stock5.setBatchNumber("SID3456AB");

        Famocid40Stock5.setMedicine(m6);

        Famocid40Stock5.setShop(shop5);

        Famocid40Stock5.setQuantity(80);

        Famocid40Stock5.setManufacturingDate(Date.valueOf("2022-12-31"));

        Famocid40Stock5.setExpiryDate(Date.valueOf("2024-11-01"));


        Famocid40Stock6.setBatchNumber("SID3456AB");

        Famocid40Stock6.setMedicine(m6);

        Famocid40Stock6.setShop(shop6);

        Famocid40Stock6.setQuantity(80);

        Famocid40Stock6.setManufacturingDate(Date.valueOf("2022-12-31"));

        Famocid40Stock6.setExpiryDate(Date.valueOf("2024-11-01"));


        Famocid40Stock7.setBatchNumber("SID3456AB");

        Famocid40Stock7.setMedicine(m6);

        Famocid40Stock7.setShop(shop7);

        Famocid40Stock7.setQuantity(80);

        Famocid40Stock7.setManufacturingDate(Date.valueOf("2022-12-31"));

        Famocid40Stock7.setExpiryDate(Date.valueOf("2024-11-01"));


        Famocid40Stock8.setBatchNumber("SID3456AB");

        Famocid40Stock8.setMedicine(m6);

        Famocid40Stock8.setShop(shop8);

        Famocid40Stock8.setQuantity(80);

        Famocid40Stock8.setManufacturingDate(Date.valueOf("2022-12-31"));

        Famocid40Stock8.setExpiryDate(Date.valueOf("2024-11-01"));


        Famocid40Stock9.setBatchNumber("SID3456AB");

        Famocid40Stock9.setMedicine(m6);

        Famocid40Stock9.setShop(shop9);

        Famocid40Stock9.setQuantity(80);

        Famocid40Stock9.setManufacturingDate(Date.valueOf("2022-12-31"));

        Famocid40Stock9.setExpiryDate(Date.valueOf("2024-11-01"));


        Famocid40Stock10.setBatchNumber("SID3456AB");

        Famocid40Stock10.setMedicine(m6);

        Famocid40Stock10.setShop(shop10);

        Famocid40Stock10.setQuantity(80);

        Famocid40Stock10.setManufacturingDate(Date.valueOf("2022-12-31"));

        Famocid40Stock10.setExpiryDate(Date.valueOf("2024-11-01"));


        PAN40Stock1.setBatchNumber("SID4567AC");

        PAN40Stock1.setMedicine(m9);

        PAN40Stock1.setShop(shop1);

        PAN40Stock1.setQuantity(55);

        PAN40Stock1.setManufacturingDate(Date.valueOf("2022-10-15"));

        PAN40Stock1.setExpiryDate(Date.valueOf("2024-09-10"));


        PAN40Stock2.setBatchNumber("SID4567AC");

        PAN40Stock2.setMedicine(m9);

        PAN40Stock2.setShop(shop2);

        PAN40Stock2.setQuantity(55);

        PAN40Stock2.setManufacturingDate(Date.valueOf("2022-10-15"));

        PAN40Stock2.setExpiryDate(Date.valueOf("2024-09-10"));


        PAN40Stock3.setBatchNumber("SID4567AC");

        PAN40Stock3.setMedicine(m9);

        PAN40Stock3.setShop(shop3);

        PAN40Stock3.setQuantity(55);

        PAN40Stock3.setManufacturingDate(Date.valueOf("2022-10-15"));

        PAN40Stock3.setExpiryDate(Date.valueOf("2024-09-10"));


        PAN40Stock4.setBatchNumber("SID4567AC");

        PAN40Stock4.setMedicine(m9);

        PAN40Stock4.setShop(shop4);

        PAN40Stock4.setQuantity(55);

        PAN40Stock4.setManufacturingDate(Date.valueOf("2022-10-15"));

        PAN40Stock4.setExpiryDate(Date.valueOf("2024-09-10"));


        PAN40Stock5.setBatchNumber("SID4567AC");

        PAN40Stock5.setMedicine(m9);

        PAN40Stock5.setShop(shop5);

        PAN40Stock5.setQuantity(55);

        PAN40Stock5.setManufacturingDate(Date.valueOf("2022-10-15"));

        PAN40Stock5.setExpiryDate(Date.valueOf("2024-09-10"));


        PAN40Stock6.setBatchNumber("SID4567AC");

        PAN40Stock6.setMedicine(m9);

        PAN40Stock6.setShop(shop6);

        PAN40Stock6.setQuantity(55);

        PAN40Stock6.setManufacturingDate(Date.valueOf("2022-10-15"));

        PAN40Stock6.setExpiryDate(Date.valueOf("2024-09-10"));


        PAN40Stock7.setBatchNumber("SID4567AC");

        PAN40Stock7.setMedicine(m9);

        PAN40Stock7.setShop(shop7);

        PAN40Stock7.setQuantity(55);

        PAN40Stock7.setManufacturingDate(Date.valueOf("2022-10-15"));

        PAN40Stock7.setExpiryDate(Date.valueOf("2024-09-10"));


        PAN40Stock8.setBatchNumber("SID4567AC");

        PAN40Stock8.setMedicine(m9);

        PAN40Stock8.setShop(shop8);

        PAN40Stock8.setQuantity(55);

        PAN40Stock8.setManufacturingDate(Date.valueOf("2022-10-15"));

        PAN40Stock8.setExpiryDate(Date.valueOf("2024-09-10"));


        PAN40Stock9.setBatchNumber("SID4567AC");

        PAN40Stock9.setMedicine(m9);

        PAN40Stock9.setShop(shop9);

        PAN40Stock9.setQuantity(55);

        PAN40Stock9.setManufacturingDate(Date.valueOf("2022-10-15"));

        PAN40Stock9.setExpiryDate(Date.valueOf("2024-09-10"));


        PAN40Stock10.setBatchNumber("SID4567AC");

        PAN40Stock10.setMedicine(m9);

        PAN40Stock10.setShop(shop10);

        PAN40Stock10.setQuantity(55);

        PAN40Stock10.setManufacturingDate(Date.valueOf("2022-10-15"));

        PAN40Stock10.setExpiryDate(Date.valueOf("2024-09-10"));


        Gudcef200Stock1.setBatchNumber("SID5678AD");

        Gudcef200Stock1.setMedicine(m7);

        Gudcef200Stock1.setShop(shop1);

        Gudcef200Stock1.setQuantity(85);

        Gudcef200Stock1.setManufacturingDate(Date.valueOf("2023-03-30"));

        Gudcef200Stock1.setExpiryDate(Date.valueOf("2024-12-31"));


        Gudcef200Stock2.setBatchNumber("SID5678AD");

        Gudcef200Stock2.setMedicine(m7);

        Gudcef200Stock2.setShop(shop2);

        Gudcef200Stock2.setQuantity(85);

        Gudcef200Stock2.setManufacturingDate(Date.valueOf("2023-03-30"));

        Gudcef200Stock2.setExpiryDate(Date.valueOf("2024-12-31"));


        Gudcef200Stock3.setBatchNumber("SID5678AD");

        Gudcef200Stock3.setMedicine(m7);

        Gudcef200Stock3.setShop(shop3);

        Gudcef200Stock3.setQuantity(85);

        Gudcef200Stock3.setManufacturingDate(Date.valueOf("2023-03-30"));

        Gudcef200Stock3.setExpiryDate(Date.valueOf("2024-12-31"));


        Gudcef200Stock4.setBatchNumber("SID5678AD");

        Gudcef200Stock4.setMedicine(m7);

        Gudcef200Stock4.setShop(shop4);

        Gudcef200Stock4.setQuantity(85);

        Gudcef200Stock4.setManufacturingDate(Date.valueOf("2023-03-30"));

        Gudcef200Stock4.setExpiryDate(Date.valueOf("2024-12-31"));


        Gudcef200Stock5.setBatchNumber("SID5678AD");

        Gudcef200Stock5.setMedicine(m7);

        Gudcef200Stock5.setShop(shop5);

        Gudcef200Stock5.setQuantity(85);

        Gudcef200Stock5.setManufacturingDate(Date.valueOf("2023-03-30"));

        Gudcef200Stock5.setExpiryDate(Date.valueOf("2024-12-31"));


        Gudcef200Stock6.setBatchNumber("SID5678AD");

        Gudcef200Stock6.setMedicine(m7);

        Gudcef200Stock6.setShop(shop6);

        Gudcef200Stock6.setQuantity(85);

        Gudcef200Stock6.setManufacturingDate(Date.valueOf("2023-03-30"));

        Gudcef200Stock6.setExpiryDate(Date.valueOf("2024-12-31"));


        Gudcef200Stock7.setBatchNumber("SID5678AD");

        Gudcef200Stock7.setMedicine(m7);

        Gudcef200Stock7.setShop(shop7);

        Gudcef200Stock7.setQuantity(85);

        Gudcef200Stock7.setManufacturingDate(Date.valueOf("2023-03-30"));

        Gudcef200Stock7.setExpiryDate(Date.valueOf("2024-12-31"));


        Gudcef200Stock8.setBatchNumber("SID5678AD");

        Gudcef200Stock8.setMedicine(m7);

        Gudcef200Stock8.setShop(shop8);

        Gudcef200Stock8.setQuantity(85);

        Gudcef200Stock8.setManufacturingDate(Date.valueOf("2023-03-30"));

        Gudcef200Stock8.setExpiryDate(Date.valueOf("2024-12-31"));


        Gudcef200Stock9.setBatchNumber("SID5678AD");

        Gudcef200Stock9.setMedicine(m7);

        Gudcef200Stock9.setShop(shop9);

        Gudcef200Stock9.setQuantity(85);

        Gudcef200Stock9.setManufacturingDate(Date.valueOf("2023-03-30"));

        Gudcef200Stock9.setExpiryDate(Date.valueOf("2024-12-31"));


        Gudcef200Stock10.setBatchNumber("SID5678AD");

        Gudcef200Stock10.setMedicine(m7);

        Gudcef200Stock10.setShop(shop10);

        Gudcef200Stock10.setQuantity(85);

        Gudcef200Stock10.setManufacturingDate(Date.valueOf("2023-03-30"));

        Gudcef200Stock10.setExpiryDate(Date.valueOf("2024-12-31"));


        AscorilLSStock1.setBatchNumber("SID6789AE");

        AscorilLSStock1.setMedicine(m13);

        AscorilLSStock1.setShop(shop1);

        AscorilLSStock1.setQuantity(120);

        AscorilLSStock1.setManufacturingDate(Date.valueOf("2023-05-01"));

        AscorilLSStock1.setExpiryDate(Date.valueOf("2025-06-30"));


        AscorilLSStock2.setBatchNumber("SID6789AE");

        AscorilLSStock2.setMedicine(m13);

        AscorilLSStock2.setShop(shop2);

        AscorilLSStock2.setQuantity(120);

        AscorilLSStock2.setManufacturingDate(Date.valueOf("2023-05-01"));

        AscorilLSStock2.setExpiryDate(Date.valueOf("2025-06-30"));


        AscorilLSStock3.setBatchNumber("SID6789AE");

        AscorilLSStock3.setMedicine(m13);

        AscorilLSStock3.setShop(shop3);

        AscorilLSStock3.setQuantity(120);

        AscorilLSStock3.setManufacturingDate(Date.valueOf("2023-05-01"));

        AscorilLSStock3.setExpiryDate(Date.valueOf("2025-06-30"));


        AscorilLSStock4.setBatchNumber("SID6789AE");

        AscorilLSStock4.setMedicine(m13);

        AscorilLSStock4.setShop(shop4);

        AscorilLSStock4.setQuantity(120);

        AscorilLSStock4.setManufacturingDate(Date.valueOf("2023-05-01"));

        AscorilLSStock4.setExpiryDate(Date.valueOf("2025-06-30"));


        AscorilLSStock5.setBatchNumber("SID6789AE");

        AscorilLSStock5.setMedicine(m13);

        AscorilLSStock5.setShop(shop5);

        AscorilLSStock5.setQuantity(120);

        AscorilLSStock5.setManufacturingDate(Date.valueOf("2023-05-01"));

        AscorilLSStock5.setExpiryDate(Date.valueOf("2025-06-30"));


        AscorilLSStock6.setBatchNumber("SID6789AE");

        AscorilLSStock6.setMedicine(m13);

        AscorilLSStock6.setShop(shop6);

        AscorilLSStock6.setQuantity(120);

        AscorilLSStock6.setManufacturingDate(Date.valueOf("2023-05-01"));

        AscorilLSStock6.setExpiryDate(Date.valueOf("2025-06-30"));


        AscorilLSStock7.setBatchNumber("SID6789AE");

        AscorilLSStock7.setMedicine(m13);

        AscorilLSStock7.setShop(shop7);

        AscorilLSStock7.setQuantity(120);

        AscorilLSStock7.setManufacturingDate(Date.valueOf("2023-05-01"));

        AscorilLSStock7.setExpiryDate(Date.valueOf("2025-06-30"));


        AscorilLSStock8.setBatchNumber("SID6789AE");

        AscorilLSStock8.setMedicine(m13);

        AscorilLSStock8.setShop(shop8);

        AscorilLSStock8.setQuantity(120);

        AscorilLSStock8.setManufacturingDate(Date.valueOf("2023-05-01"));

        AscorilLSStock8.setExpiryDate(Date.valueOf("2025-06-30"));


        AscorilLSStock9.setBatchNumber("SID6789AE");

        AscorilLSStock9.setMedicine(m13);

        AscorilLSStock9.setShop(shop9);

        AscorilLSStock9.setQuantity(120);

        AscorilLSStock9.setManufacturingDate(Date.valueOf("2023-05-01"));

        AscorilLSStock9.setExpiryDate(Date.valueOf("2025-06-30"));


        AscorilLSStock10.setBatchNumber("SID6789AE");

        AscorilLSStock10.setMedicine(m13);

        AscorilLSStock10.setShop(shop10);

        AscorilLSStock10.setQuantity(120);

        AscorilLSStock10.setManufacturingDate(Date.valueOf("2023-05-01"));

        AscorilLSStock10.setExpiryDate(Date.valueOf("2025-06-30"));


        Session session = factory.getCurrentSession();

        Transaction tx = session.beginTransaction();


        session.save(Calpol650mgStock1);

        session.save(Calpol650mgStock2);

        session.save(Calpol650mgStock3);

        session.save(Calpol650mgStock4);

        session.save(Calpol650mgStock5);

        session.save(Calpol650mgStock6);

        session.save(Calpol650mgStock7);

        session.save(Calpol650mgStock8);

        session.save(Calpol650mgStock9);

        session.save(Calpol650mgStock10);

        session.save(Famocid40Stock1);

        session.save(Famocid40Stock2);

        session.save(Famocid40Stock3);

        session.save(Famocid40Stock4);

        session.save(Famocid40Stock5);

        session.save(Famocid40Stock6);

        session.save(Famocid40Stock7);

        session.save(Famocid40Stock8);

        session.save(Famocid40Stock9);

        session.save(Famocid40Stock10);

        session.save(PAN40Stock1);

        session.save(PAN40Stock2);

        session.save(PAN40Stock3);

        session.save(PAN40Stock4);

        session.save(PAN40Stock5);

        session.save(PAN40Stock6);

        session.save(PAN40Stock7);

        session.save(PAN40Stock8);

        session.save(PAN40Stock9);

        session.save(PAN40Stock10);

        session.save(Gudcef200Stock1);

        session.save(Gudcef200Stock2);

        session.save(Gudcef200Stock3);

        session.save(Gudcef200Stock4);

        session.save(Gudcef200Stock5);

        session.save(Gudcef200Stock6);

        session.save(Gudcef200Stock7);

        session.save(Gudcef200Stock8);

        session.save(Gudcef200Stock9);

        session.save(Gudcef200Stock10);

        session.save(AscorilLSStock1);

        session.save(AscorilLSStock2);

        session.save(AscorilLSStock3);

        session.save(AscorilLSStock4);

        session.save(AscorilLSStock5);

        session.save(AscorilLSStock6);

        session.save(AscorilLSStock7);

        session.save(AscorilLSStock8);

        session.save(AscorilLSStock9);

        session.save(AscorilLSStock10);

        tx.commit();


//session.close();

//factory.close();

    }

}