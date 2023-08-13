package com.Entities;

import javax.persistence.*;

@Entity
public class Address
{
    //..............COLUMN..............//
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    @Column(name = "house_no")
    private String houseNumber;

    @Column(name = "street_name")
    private String streetName;

    private String block;

    private String locality;

    private String landmark;

    private String city;

    private int pincode;

    private int mobilenumber;

    @Column(name = "address_type")
    private String addressType;


    //..............RELATIONSHIP..............//
    @ManyToOne
    @JoinColumn(name = "customer_Id")
    private Customer customer;


    public Address() {
    }

    public Address(int addressId, String houseNumber, String streetName, String block, String locality, String landmark, String city, int pincode, int mobilenumber, String addressType, Customer customer) {
        this.addressId = addressId;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.block = block;
        this.locality = locality;
        this.landmark = landmark;
        this.city = city;
        this.pincode = pincode;
        this.mobilenumber = mobilenumber;
        this.addressType = addressType;
        this.customer = customer;
    }

    //..............GETTER & SETTER..............//

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + houseNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", block='" + block + '\'' +
                ", locality='" + locality + '\'' +
                ", landmark='" + landmark + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                ", mobilenumber=" + mobilenumber +
                '}';
    }
}