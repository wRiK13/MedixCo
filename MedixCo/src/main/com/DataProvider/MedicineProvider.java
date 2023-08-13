package com.DataProvider;

import com.Dao.FactoryProvider;
import com.Entities.Medicine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MedicineProvider
{
    static Medicine m1 = new Medicine(),
                    m2 = new Medicine(),
                    m3 = new Medicine(),
                    m4 = new Medicine(),
                    m5 = new Medicine(),
                    m6 = new Medicine(),
                    m7 = new Medicine(),
                    m8 = new Medicine(),
                    m9 = new Medicine(),
                    m10 = new Medicine(),
                    m11 = new Medicine(),
                    m12 = new Medicine(),
                    m13 = new Medicine(),
                    m14 = new Medicine(),
                    m15 = new Medicine(),
                    m16 = new Medicine(),
                    m17 = new Medicine(),
                    m18 = new Medicine(),
                    m19 = new Medicine(),
                    m20 = new Medicine();

    public static void main(String[] args)
    {
        System.out.println("Project started....");
        SessionFactory factory = FactoryProvider.getFactory();
        //SessionFactory factory = new Configuration().configure("config.xml").buildSessionFactory();

        m1.setName("Ascoril LS Syrup");
        m1.setCompanyName("Glenmark Pharmaceuticals Ltd");
        m1.setType("Syrup");
        m1.setPrice(118.52);

        m2.setName("Budecort 200 Inhaler");
        m2.setCompanyName("Cipla Ltd");
        m2.setType("Inhaler");
        m2.setPrice(450.92);

        m3.setName("Calpol 650mg Tablet");
        m3.setCompanyName("Glaxo SmithKline Pharmaceuticals Ltd");
        m3.setType("Tablet");
        m3.setPrice(30.07);

        m4.setName("Dolonex DT 20mg Tablet");
        m4.setCompanyName("Pfizer Ltd");
        m4.setType("Tablet");
        m4.setPrice(171.12);

        m5.setName("Eyemist Eye Drop");
        m5.setCompanyName("Sun Pharmaceutical Industries Ltd");
        m5.setType("Eye Drop");
        m5.setPrice(187);

        m6.setName("Famocid 40 Strip of 14");
        m6.setCompanyName("Sun Pharmaceutical Industries Ltd");
        m6.setType("Tablet");
        m6.setPrice(9.60);

        m7.setName("Gudcef 200 Tablet");
        m7.setCompanyName("Mankind Pharma Ltd");
        m7.setType("Tablet");
        m7.setPrice(153.28);

        m8.setName("Hcg 5000IU Injection");
        m8.setCompanyName("Zydus Cadila");
        m8.setType("Injection");
        m8.setPrice(397.18);

        m9.setName("Inderal 10 Tablet");
        m9.setCompanyName("Abbott");
        m9.setType("Tablet");
        m9.setPrice(20.58);

        m10.setName("Jenvac Vaccine");
        m10.setCompanyName("Bharat Biotech");
        m10.setType("Vaccine");
        m10.setPrice(634.12);

        m11.setName("Ketorol-DT Tablet");
        m11.setCompanyName("Dr Reddy's Laboratories Ltd");
        m11.setType("Tablet");
        m11.setPrice(124.20);

        m12.setName("Lasilactone 50 Tablet");
        m12.setCompanyName("Sanofi India Ltd");
        m12.setType("Tablet");
        m12.setPrice(52.94);

        m13.setName("Meprate 10mg Tablet");
        m13.setCompanyName("Serum Institute Of India Ltd");
        m13.setType("Tablet");
        m13.setPrice(62.38);

        m14.setName("Nexpro RD 40 Capsule SR");
        m14.setCompanyName("Torrent Pharmaceuticals Ltd");
        m14.setType("Tablet");
        m14.setPrice(144.44);

        m15.setName("O2 Tablet");
        m15.setCompanyName("Medley Pharmaceuticals");
        m15.setType("Tablet");
        m15.setPrice(149.04);

        m16.setName("PAN 40 Tablet");
        m16.setCompanyName("Alkem Laboratories Ltd");
        m16.setType("Tablet");
        m16.setPrice(139.84);

        m17.setName("Q-Car Tablet");
        m17.setCompanyName("Nexgen Pharma");
        m17.setType("Tablet");
        m17.setPrice(279.69);

        m18.setName("Rantac 150 Tablet");
        m18.setCompanyName("J B Chemicals and Pharmaceuticals Ltd");
        m18.setType("Tablet");
        m18.setPrice(44.8);

        m19.setName("Sorbiline Syrup");
        m19.setCompanyName("Franco-Indian Pharmaceuticals Pvt Ltd");
        m19.setType("Syrup");
        m19.setPrice(139.84);

        m20.setName("Telma H Tablet");
        m20.setCompanyName("Glenmark Pharmaceuticals Ltd");
        m20.setType("Tablet");
        m20.setPrice(284.5);

        Session session = factory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        // tx.begin();

        session.save(m1);
        session.save(m2);
        session.save(m3);
        session.save(m4);
        session.save(m5);
        session.save(m6);
        session.save(m7);
        session.save(m8);
        session.save(m9);
        session.save(m10);
        session.save(m11);
        session.save(m12);
        session.save(m13);
        session.save(m14);
        session.save(m15);
        session.save(m16);
        session.save(m17);
        session.save(m18);
        session.save(m19);
        session.save(m20);

        tx.commit();

//        session.close();
//        factory.close();
    }
}
