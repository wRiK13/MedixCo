package com.DataProvider;

import com.Entities.DeliveryPartner;
import com.Dao.FactoryProvider;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;

public class DeliveryPartnerProvider {
    public static void main(String[] args) {
        DeliveryPartner person1 = new DeliveryPartner();
        DeliveryPartner person2 = new DeliveryPartner();
        DeliveryPartner person3 = new DeliveryPartner();
        DeliveryPartner person4 = new DeliveryPartner();
        DeliveryPartner person5 = new DeliveryPartner();
        DeliveryPartner person6 = new DeliveryPartner();
        DeliveryPartner person7 = new DeliveryPartner();
        DeliveryPartner person8 = new DeliveryPartner();
        DeliveryPartner person9 = new DeliveryPartner();
        DeliveryPartner person10 = new DeliveryPartner();

        person1.setName("Jayanta Das");
        person1.setAddress("Ballygunge, Kolkata, West Bengal 700025");
        person1.setMobile("9820458628");
        person1.setEmailId("jay87@gmail.com");
        person1.setDateOfBirth(Date.valueOf("1993-11-27"));

        person2.setName("Rameshwar Mistri");
        person2.setAddress("Bansdroni, Kolkata, West Bengal 700040");
        person2.setMobile("9512425617");
        person2.setEmailId("rao.rameshwar@gmail.com");
        person2.setDateOfBirth(Date.valueOf("1997-09-12"));

        person3.setName("Kuldeep Kumar");
        person3.setAddress("Salt Lake, Kolkata, West Bengal 700064");
        person3.setMobile("7412395084");
        person3.setEmailId("deepkumar@gmail.com");
        person3.setDateOfBirth(Date.valueOf("1996-06-30"));

        person4.setName("Kamal Patra");
        person4.setAddress("");
        person4.setMobile("8742103952");
        person4.setEmailId("deepkumar@gmail.com");
        person4.setDateOfBirth(Date.valueOf("1995-10-02"));

        person5.setName("Vipul Gupta");
        person5.setAddress("");
        person5.setMobile("9410325746");
        person5.setEmailId("vipul1997@gmail.com");
        person5.setDateOfBirth(Date.valueOf("1997-03-15"));

        person6.setName("Ravi Chanda");
        person6.setAddress("Nagerbazar, Kolkata, West Bengal 700074");
        person6.setMobile("7981032590");
        person6.setEmailId("ravi69@gmail.com");
        person6.setDateOfBirth(Date.valueOf("1996-01-26"));

        person7.setName("Rajesh Ghosh");
        person7.setAddress("");
        person7.setMobile("84203694125");
        person7.setEmailId("raja5478@gmail.com");
        person7.setDateOfBirth(Date.valueOf("2001-09-22"));

        person8.setName("Yusuf Ali");
        person8.setAddress("Park Street area, Kolkata, West Bengal 700071");
        person8.setMobile("9874120364");
        person8.setEmailId("ali8574@gmail.com");
        person8.setDateOfBirth(Date.valueOf("2002-12-09"));

        person9.setName("Krishna Yadav");
        person9.setAddress("Chinar Park, Kolkata, West Bengal 700136");
        person9.setMobile("7841032569");
        person9.setEmailId("krish16@gmail.com");
        person9.setDateOfBirth(Date.valueOf("1997-08-29"));

        person10.setName("Babu Mondal");
        person10.setAddress("Jadavpur, Kolkata, West Bengal 700032, India");
        person10.setMobile("9874123503");
        person10.setEmailId("babu1999@gmail.com");
        person10.setDateOfBirth(Date.valueOf("1999-07-11"));

        Session session = FactoryProvider.getFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(person1);
        session.save(person2);
        session.save(person3);
        session.save(person4);
        session.save(person5);
        session.save(person6);
        session.save(person7);
        session.save(person8);
        session.save(person9);
        session.save(person10);

        tx.commit();
        session.close();
    }
}