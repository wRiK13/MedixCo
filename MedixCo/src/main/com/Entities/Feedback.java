package com.Entities;

import javax.persistence.*;

@Entity
public class Feedback
{
//..............COLUMN..............//
//    private Object GenerationType;
    @Id
    @Column(name = "feedback_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedbackId;


    //..............RELATIONSHIP..............//
    @OneToOne
    @JoinColumn(name = "delivery_partner_id")
    private DeliveryPartner deliveryPartner;

    @OneToOne
    @JoinColumn(name = "order_id")
    private OrderMed orderMed;

    private double ratings;

    private String comment;


    public Feedback() {
    }


    //..............GETTER & SETTER..............//
//    public Object getGenerationType() {
//        return GenerationType;
//    }
//    public void setGenerationType(Object generationType) {
//        GenerationType = generationType;
//    }

    public int getFeedbackId() {
        return feedbackId;
    }
    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public DeliveryPartner getDeliveryPartner() {
        return deliveryPartner;
    }
    public void setDeliveryPartner(DeliveryPartner deliveryPartner) {
        this.deliveryPartner = deliveryPartner;
    }

    public OrderMed getOrder() {
        return orderMed;
    }
    public void setOrder(OrderMed orderMed) {
        this.orderMed = orderMed;
    }

    public double getRatings() {
        return ratings;
    }
    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}