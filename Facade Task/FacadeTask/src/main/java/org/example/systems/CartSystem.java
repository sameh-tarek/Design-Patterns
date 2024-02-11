package org.example.systems;

public class CartSystem {
    public void addItem(String product, int quantity) {
        System.out.println("Adding " + quantity + " units of product: " + product + " to cart");
    }

    public void removeItem(String product, int quantity) {
        System.out.println("Removing " + quantity + " units of product: " + product + " from cart");
    }
}
