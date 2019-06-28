package com.application.main;

import com.application.model.Address;
import com.application.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){

        UserDetails userDetails = new UserDetails();
        userDetails.setUsername("aayush");

        Address address = new Address();
        address.setCity("kathmandu");
        address.setPincode("29418");
        address.setState("ktm state");
        address.setStreet("battishputali");
        userDetails.setAddress(address);

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDetails);
        session.getTransaction().commit();
        session.close();
    }
}
