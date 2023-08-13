package com.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Confirmation
{
    //..............COLUMN..............//
    @Id
    @Column(name = "confirmation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int confirmationId;

    @Column(name = "order_Date_Time")
    private Timestamp orderDateTime;

    @Column(name = "mode_of_payment", length = 20)
    private String paymentMode;

    @Column(name = "delivery_date")
    private Timestamp deliveryDate;

    private String status;


    //..............RELATIONSHIP..............//
    @OneToOne
    @JoinColumn(name = "order_id")
    private OrderMed orderMed;

    @OneToOne
    @JoinColumn(name = "delivery_partner_id")
    private DeliveryPartner deliverypartner;


    public Confirmation() {
    }


    //..............GETTER & SETTER..............//

    public int getConfirmationId() {
        return confirmationId;
    }

    public void setConfirmationId(int confirmationId) {
        this.confirmationId = confirmationId;
    }

    public Timestamp getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(Timestamp orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderMed getOrder() {
        return orderMed;
    }

    public void setOrder(OrderMed orderMed) {
        this.orderMed = orderMed;
    }

    public DeliveryPartner getDeliverypartner() {
        return deliverypartner;
    }

    public void setDeliverypartner(DeliveryPartner deliverypartner) {
        this.deliverypartner = deliverypartner;
    }
}