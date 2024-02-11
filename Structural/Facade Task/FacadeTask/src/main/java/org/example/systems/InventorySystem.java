package org.example.systems;

public class InventorySystem {
    public void checkAvailability(String product){
        System.out.println("Checking availability of product: " + product);
    }

    public void reserveProduct(String product, int quantity){
        System.out.println("Reserving " + quantity + " units of product: " + product);
    }
}
