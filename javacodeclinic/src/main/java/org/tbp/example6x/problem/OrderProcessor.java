package org.tbp.example6x.problem;

public class OrderProcessor {
    public void processOrder(Order order) {
        // Checking for a specific product type and quantity
        if (order.getProductType().equals("ELECTRONICS") && order.getQuantity() > 10) {
            // Apply bulk discount
            System.out.println("Bulk Discount Applied");
        } else if (order.getProductType().equals("CLOTHING") && order.getQuantity() <= 5) {
            // Apply standard rate
            System.out.println("Standard Price Applied");
        }
    }
}
