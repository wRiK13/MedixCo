package com.Entities;

import javax.persistence.*;

@Entity
public class OrderMed
{
    //..............COLUMN..............//
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "cart_value")
    private double cartValue;

    @Column(name = "ordered_medicines", length = 500)
    private String orderedMedicines;


    ///..............RELATIONSHIP..............//
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    public OrderMed() {
    }


    //..............GETTER & SETTER..............//

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getCartValue() {
        return cartValue;
    }

    public void setCartValue(double cartValue) {
        this.cartValue = cartValue;
    }

    public String getOrderedMedicines() {
        return orderedMedicines;
    }

    public void setOrderedMedicines(String orderedMedicines) {
        this.orderedMedicines = orderedMedicines;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}