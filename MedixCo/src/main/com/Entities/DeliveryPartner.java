package com.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class DeliveryPartner
{
    //..............COLUMN..............//
    @Id
    @Column(name = "delivery_partner_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deliverypartnerId;

    private String name;

    private String mobile;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "DOB")
    private Date dateOfBirth;

    private String address;


    public DeliveryPartner() {
    }


    //..............GETTER & SETTER..............//
    public int getDeliverypartnerId() {
        return deliverypartnerId;
    }
    public void setDeliverypartnerId(int deliverypartnerId) {
        this.deliverypartnerId = deliverypartnerId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}