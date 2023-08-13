package com.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Stock
{
    //..............COLUMN..............//
    @Id
    @Column(name = "stock_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stockId;

    private String batchNumber;

    @Column(name = "manufacturing_date")
    private Date manufacturingDate;

    @Column(name = "expiry_date")
    private Date expiryDate;

    private long quantity;


    //..............RELATIONSHIP..............//
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "med_Id")
    private Medicine medicine;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shop_Id")
    private Shop shop;


    public Stock() {
    }


    //..............GETTER & SETTER..............//


    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}