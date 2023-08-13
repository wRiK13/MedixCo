package com.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Medicine
{
    //..............COLUMN..............//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "med_id")
    private int medicineId;

    @Column(name = "med_name")
    private String name;

    @Column(name = "company_name")
    private String companyName;

    private String type;

    private double price;


    public Medicine() {
    }

    public Medicine(int medicineId, String name, String companyName, String type, double price) {
        this.medicineId = medicineId;
        this.name = name;
        this.companyName = companyName;
        this.type = type;
        this.price = price;
    }

    //..............GETTER & SETTER..............//
    public int getMedicineId() {
        return medicineId;
    }
    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
