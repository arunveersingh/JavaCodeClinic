package org.tbp.example6x.solution1;

import java.util.Date;

public class Order {
    private Date orderDate;
    private String productType;
    private Integer quantity;

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean isElectronics(){
        return this.getProductType().equals("ELECTRONICS");
    }

    public boolean isClothing(){
        return this.getProductType().equals("CLOTHING");
    }

    public boolean isBulk(){
        return this.getQuantity() > 10;
    }

    public boolean isSmall(){
        return this.getQuantity() <= 5;
    }

    public boolean isElectronicsAndBulk(){
        return isElectronics() && isBulk();
    }

    public boolean isClothingAndSmall(){
        return isClothing() && isSmall();
    }
}

