package com.Dao;

import com.Entities.Customer;

public class CustomerProvider {
    public static Customer customer;

    public static Customer getCustomer() {
        return customer;
    }
    public static void setCustomer(Customer customer) {
        CustomerProvider.customer = customer;
    }


}