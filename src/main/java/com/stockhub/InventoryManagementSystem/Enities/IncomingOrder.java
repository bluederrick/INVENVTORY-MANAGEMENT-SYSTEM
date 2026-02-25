package com.stockhub.InventoryManagementSystem.Enities;

import jakarta.persistence.Entity;

@Entity

public class IncomingOrder extends BaseModel{

    private Integer productId ;

    private Integer supplierId ;

    private Integer  quantitySupply ;

    private double totalPrice ;


    public IncomingOrder() {
    }


    public IncomingOrder(Integer productId, Integer supplierId, Integer quantitySupply, double totalPrice) {
        this.productId = productId;
        this.supplierId = supplierId;
        this.quantitySupply = quantitySupply;
        this.totalPrice = totalPrice;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getQuantitySupply() {
        return quantitySupply;
    }

    public void setQuantitySupply(Integer quantitySupply) {
        this.quantitySupply = quantitySupply;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
