package com.Dao;

public class CartProvider {

    public static Cart cart;
    public static Cart getCart(){
    if (cart == null)
    {
        cart = new Cart();
    }
        return cart;
    }
    public static void setCart(Cart cart) {
        CartProvider.cart = cart;
    }
}