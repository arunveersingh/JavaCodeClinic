package org.tbp.example6x.solution1;

public class OrderProcessor {
    public void processOrder(Order order) {
        // Checking for a specific product type and quantity
        if (order.isElectronicsAndBulk()) {
            // Apply bulk discount
            System.out.println("Bulk Discount Applied");
        } else if (order.isClothingAndSmall()) {
            // Apply standard rate
            System.out.println("Standard Price Applied");
        }
    }
}
