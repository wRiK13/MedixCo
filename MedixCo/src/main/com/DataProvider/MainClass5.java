package com.DataProvider;

import com.Entities.Medicine;
import com.Entities.Stock;
import com.Entities.Shop;
import com.Dao.FactoryProvider;
import org.hibernate.Session;

import java.sql.Date;

public class MainClass5
{
    public static void main(String[] args)
    {
        Session session = FactoryProvider.getFactory().openSession();
        Shop HowrahMedixCo = session.get(Shop.class, 1);

        // Hansaplast Regular
        Medicine HansaplastRegular = new Medicine();
        HansaplastRegular.setName("Hansaplast Regular");
        HansaplastRegular.setType("Band-aid");
        HansaplastRegular.setCompanyName("Beiersdorf AG");
        HansaplastRegular.setPrice(190.00);

        Stock HansaplastRegularStock = new Stock();
        HansaplastRegularStock.setBatchNumber("STID4607AN");
        HansaplastRegularStock.setMedicine(HansaplastRegular);
        HansaplastRegularStock.setShop(HowrahMedixCo);
        HansaplastRegularStock.setQuantity(70);
        HansaplastRegularStock.setManufacturingDate(Date.valueOf("2023-06-01"));
        HansaplastRegularStock.setExpiryDate(Date.valueOf("2025-05-31"));

        // Pampers Active Baby Diaper Small
        Medicine PampersActiveBabyDiaperSmall = new Medicine();
        PampersActiveBabyDiaperSmall.setName("Pampers Active Baby Diaper Small of 46");
        PampersActiveBabyDiaperSmall.setType("Diaper");
        PampersActiveBabyDiaperSmall.setCompanyName("Procter & Gamble Hygiene and Health Care Ltd");
        PampersActiveBabyDiaperSmall.setPrice(775.00);

        Stock PampersActiveBabyDiaperSmallStock = new Stock();
        PampersActiveBabyDiaperSmallStock.setBatchNumber("STID84209AO");
        PampersActiveBabyDiaperSmallStock.setMedicine(PampersActiveBabyDiaperSmall);
        PampersActiveBabyDiaperSmallStock.setShop(HowrahMedixCo);
        PampersActiveBabyDiaperSmallStock.setQuantity(300);
        PampersActiveBabyDiaperSmallStock.setManufacturingDate(Date.valueOf("2023-05-31"));
        PampersActiveBabyDiaperSmallStock.setExpiryDate(Date.valueOf("2024-04-01"));

    }
}