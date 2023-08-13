package com.Dao;

import com.Entities.Medicine;
//import com.mysql.cj.Session;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

    private Map<Integer, Integer> medicineMap;
    private List<String> medicineList;
    double cartValue;
    Session session;

    public Cart()
    {
        medicineMap = new HashMap<>();
        medicineList = new ArrayList<>();
        cartValue = 0.00;
        session = (Session) FactoryProvider.getFactory().openSession();
    }

    //adding the quantity of medicine
    public void add(int medId, int quantity)
    {
        Medicine med = session.get(Medicine.class, medId);
        if(medicineMap.containsKey(medId))
        {
            int initialQty = medicineMap.get(medId);
            cartValue -= med.getPrice() * initialQty;
            medicineMap.replace(medId, quantity);
        }
        else {
            medicineMap.put(medId, quantity);
            String s = med.getName() + " (" + quantity + " )";
            medicineList.add(s);
        }
        cartValue += med.getPrice() * quantity;
    }

    //displaying the medicine list
    public void displayMedicineList()
    {
        for (String med: medicineList)
        {
            System.out.println(med + ", ");
        }
    }

    //if medicine is removed from cart
    public void removeMedicine(int medId)
    {
        Medicine med = session.get(Medicine.class, medId);
        cartValue -= medicineMap.get(medId) * med.getPrice();
        medicineMap.remove(medId);
        medicineList.remove(med);
    }

    public Map<Integer, Integer> getMedicineMap() {
        return medicineMap;
    }

    public List<String> getMedicineList() {
        return medicineList;
    }

    public double getCartValue() {
        return cartValue;
    }

    public void closeSession()
    {
        session.close();
    }

    public void clearCart()
    {
        medicineMap.clear();
        medicineList.clear();
        cartValue = 0.00;
    }
}