package org.example.facade;

import org.example.systems.CartSystem;
import org.example.systems.InventorySystem;
import org.example.systems.PaymentGateway;
import org.example.systems.ShippingService;

public class OnlineShoppingFacade {
    private InventorySystem inventorySystem;
    private CartSystem cartSystem;
    private PaymentGateway paymentGateway;
    private ShippingService shippingService;

    public OnlineShoppingFacade() {
        inventorySystem = new InventorySystem();
        cartSystem = new CartSystem();
        paymentGateway = new PaymentGateway();
        shippingService = new ShippingService();
    }

    public void addToCart(String product, int quantity){
        inventorySystem.checkAvailability(product);
        inventorySystem.reserveProduct(product, quantity);
        cartSystem.addItem(product, quantity);
    }

    public void removeFromCart(String product, int quantity){
        cartSystem.removeItem(product, quantity);
    }

    public void checkout(double totalAmount, String shippingAddress){
        paymentGateway.processPayment(totalAmount);
        shippingService.shipOrder(shippingAddress);
        System.out.println("Order successfully placed!");
    }
}
