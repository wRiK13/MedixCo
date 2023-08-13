package com.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Shop
{
    //..............COLUMN..............//
    @Id
    @Column(name = "shop_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopId;

    private String name;


    //..............RELATIONSHIP..............//
    @OneToMany(mappedBy = "shop")
    private List<OrderMed> orderMedList;

    @OneToMany(mappedBy = "shop")
    private List<Stock> stockList;


    public Shop() {
    }


    //..............GETTER & SETTER..............//

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrderMed> getOrderMedList() {
        return orderMedList;
    }

    public void setOrderMedList(List<OrderMed> orderMedList) {
        this.orderMedList = orderMedList;
    }

    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }
}