package org.example;

import org.example.facade.OnlineShoppingFacade;

public class Main {
    public static void main(String[] args) {
        OnlineShoppingFacade onlineShoppingFacade = new OnlineShoppingFacade();

        // Add item to cart
        onlineShoppingFacade.addToCart("Laptop", 1);
        onlineShoppingFacade.addToCart("Iphone", 2);

        // Remove item from cart
        onlineShoppingFacade.removeFromCart("Iphone", 1);

        // Checkout
        onlineShoppingFacade.checkout(20000.00, "123 st, Cairo, Egypt");
    }
}