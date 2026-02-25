package com.stockhub.InventoryManagementSystem.Enities;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity

public class Product extends BaseModel {

    private String productName;

    private Integer categoryId;

    private Integer availableQuantity;

    private Integer unitPrice;

    private Integer totaPrice;

    private LocalDate DateCreated;

    public Product() {
    }

    public Product(String productName, Integer categoryId, Integer availableQuantity, Integer unitPrice, Integer totaPrice, LocalDate dateCreated) {
        this.productName = productName;
        this.categoryId = categoryId;
        this.availableQuantity = availableQuantity;
        this.unitPrice = unitPrice;
        this.totaPrice = totaPrice;
        DateCreated = dateCreated;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getTotaPrice() {
        return totaPrice;
    }

    public void setTotaPrice(Integer totaPrice) {
        this.totaPrice = totaPrice;
    }

    public LocalDate getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        DateCreated = dateCreated;
    }
}
