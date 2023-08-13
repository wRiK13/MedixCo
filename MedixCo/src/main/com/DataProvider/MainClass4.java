package com.DataProvider;

import com.Entities.Medicine;
import com.Entities.Stock;
import com.Entities.Shop;
import com.Dao.FactoryProvider;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;

public class MainClass4
{
    public static void main(String[] args)
    {
        Session session = FactoryProvider.getFactory().openSession();
        Shop BarasatMedixCo = session.get(Shop.class, 1);

        // Neurobion Forte
        Medicine NeurobionForte = new Medicine();
        NeurobionForte.setName("Neurobion Forte");
        NeurobionForte.setType("Tablet");
        NeurobionForte.setCompanyName("Procter & Gamble Hygiene and Health Care Ltd");
        NeurobionForte.setPrice(38.1);

        Stock NeurobionForteStock = new Stock();
        NeurobionForteStock.setBatchNumber("STID4561AJ");
        NeurobionForteStock.setMedicine(NeurobionForte);
        NeurobionForteStock.setShop(BarasatMedixCo);
        NeurobionForteStock.setQuantity(285);
        NeurobionForteStock.setManufacturingDate(Date.valueOf("2023-05-31"));
        NeurobionForteStock.setExpiryDate(Date.valueOf("2025-04-01"));

        // Volini Spray
        Medicine Volini = new Medicine();
        Volini.setName("Volini for sprain, muscle and joint pain Spray");
        Volini.setType("Spray");
        Volini.setCompanyName("Sun Pharmaceutical Industries Ltd");
        Volini.setPrice(288.00);

        Stock VoliniStock = new Stock();
        VoliniStock.setBatchNumber("STID7894AK");
        VoliniStock.setMedicine(Volini);
        VoliniStock.setShop(BarasatMedixCo);
        VoliniStock.setQuantity(150);
        VoliniStock.setManufacturingDate(Date.valueOf("2023-03-31"));
        VoliniStock.setExpiryDate(Date.valueOf("2025-04-30"));

        // ORSL Plus
        Medicine ORSLPlus = new Medicine();
        ORSLPlus.setName("ORSL Plus Orange Drink");
        ORSLPlus.setType("Electrolyte and Energy Drink");
        ORSLPlus.setCompanyName("JNTL Consumer Health (India) Pvt. Ltd.");
        ORSLPlus.setPrice(38.00);

        Stock ORSLPlusStock = new Stock();
        ORSLPlusStock.setBatchNumber("STID2079AL");
        ORSLPlusStock.setMedicine(ORSLPlus);
        ORSLPlusStock.setShop(BarasatMedixCo);
        ORSLPlusStock.setQuantity(280);
        ORSLPlusStock.setManufacturingDate(Date.valueOf("2023-02-28"));
        ORSLPlusStock.setExpiryDate(Date.valueOf("2024-01-31"));

        // Liv.52
        Medicine Liv52 = new Medicine();
        Liv52.setName("Himalaya Liv.52 Syrup");
        Liv52.setType("Syrup");
        Liv52.setCompanyName("Himalaya Drug Company");
        Liv52.setPrice(165.00);

        Stock Liv52Stock = new Stock();
        Liv52Stock.setBatchNumber("STID2456AM");
        Liv52Stock.setMedicine(Liv52);
        Liv52Stock.setShop(BarasatMedixCo);
        Liv52Stock.setQuantity(145);
        Liv52Stock.setManufacturingDate(Date.valueOf("2023-01-01"));
        Liv52Stock.setExpiryDate(Date.valueOf("2024-12-31"));

        Transaction tx = session.beginTransaction();

        session.save(NeurobionForte);
        session.save(Volini);
        session.save(ORSLPlus);
        session.save(Liv52);

        session.save(NeurobionForteStock);
        session.save(VoliniStock);
        session.save(ORSLPlusStock);
        session.save(Liv52Stock);

        tx.commit();
        session.close();
    }
}
