package com.Entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Project started....");
        SessionFactory factory = new Configuration().configure("config.xml").buildSessionFactory();

        Session session = factory.openSession();
        session.close();
        factory.close();
    }
}