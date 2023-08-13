package com.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer
{
//..............COLUMN..............//
//    private Object GenerationType;
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;

    private String cust_name;

    @Column(name = "email_id")
    private String mailId;

    @Column(unique = true)
    private String phone_number;

    @Column(name = "DOB")
    private String dateofbirth;

    private String password;


    //..............RELATIONSHIP..............//
    @OneToMany(mappedBy = "customer")
    private List<Address> addressList;

    @OneToMany(mappedBy = "customer")
    private List<OrderMed> orderMedList;


    public Customer() {
    }


    //..............GETTER & SETTER..............//
//    public Object getGenerationType() {
//        return GenerationType;
//    }
//    public void setGenerationType(Object generationType) {
//        GenerationType = generationType;
//    }

    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCust_name() {
        return cust_name;
    }
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getMailId() {
        return mailId;
    }
    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }
    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public List<Address> getAddressList() {
        return addressList;
    }
    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<OrderMed> getOrderList() {
        return orderMedList;
    }
    public void setOrderList(List<OrderMed> orderMedList) {
        this.orderMedList = orderMedList;
    }


    //..............TO STRING..............//

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", cust_name='" + cust_name + '\'' +
                ", mailId='" + mailId + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", addressList=" + addressList +
                '}';
    }
}