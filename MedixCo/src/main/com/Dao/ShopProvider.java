package com.Dao;

import com.Entities.Shop;

public class ShopProvider {
    public static Shop shop = null;

    public static Shop getShop() {
        return shop;
    }

    public static void setShop(Shop shop) {
        ShopProvider.shop = shop;
    }
}