package com.stockhub.InventoryManagementSystem.Enities;

import jakarta.persistence.Entity;

import java.time.LocalDate;


@Entity
public class OutgoingOrder extends BaseModel {

    private Integer productId ;

    private Integer quantityOrder ;

    private double totalPriceBeforeDiscount ;

    private  double discount ;

    private  double totalPriceAfterDiscount ;

    private LocalDate orderDate ;


    public OutgoingOrder() {
    }

    public OutgoingOrder(Integer productId, Integer quantityOrder, double totalPriceBeforeDiscount, double discount, double totalPriceAfterDiscount, LocalDate orderDate) {
        this.productId = productId;
        this.quantityOrder = quantityOrder;
        this.totalPriceBeforeDiscount = totalPriceBeforeDiscount;
        this.discount = discount;
        this.totalPriceAfterDiscount = totalPriceAfterDiscount;
        this.orderDate = orderDate;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(Integer quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

    public double getTotalPriceBeforeDiscount() {
        return totalPriceBeforeDiscount;
    }

    public void setTotalPriceBeforeDiscount(double totalPriceBeforeDiscount) {
        this.totalPriceBeforeDiscount = totalPriceBeforeDiscount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalPriceAfterDiscount() {
        return totalPriceAfterDiscount;
    }

    public void setTotalPriceAfterDiscount(double totalPriceAfterDiscount) {
        this.totalPriceAfterDiscount = totalPriceAfterDiscount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
