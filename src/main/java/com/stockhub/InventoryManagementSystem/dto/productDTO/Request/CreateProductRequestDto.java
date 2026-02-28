package com.stockhub.InventoryManagementSystem.dto.productDTO.Request;

import java.time.LocalDate;


//Admin  creates product nad saves to the Database

public class CreateProductRequestDto {

    private String name;

    private Integer categoryId ;

//    private CATEGORY category ;

    private Integer  availableQuantity;

    private Integer unitPrice;

    private Integer  totalPrice ;

    private LocalDate DateCreated;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryId(Integer categoryId){
        this.categoryId =categoryId ;
    }
    public Integer getCategoryId(){
        return categoryId ;
    }

//    public CATEGORY getCategory() {
//        return category;
//    }
//
//    public void setCategory(CATEGORY category) {
//        this.category = category;
//    }

    public Integer getAvailableQuantity(){
        return availableQuantity ;
    }
    public void setAvailableQuantity(Integer availableQuantity){
        this.availableQuantity=availableQuantity ;

    }
    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setTotalPrice(Integer totalPrice){
        this.totalPrice = totalPrice ;
    }

    public Integer getTotalPrice(){
        return totalPrice ;
    }

    public LocalDate getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        DateCreated = dateCreated;
    }

//    public String getContactPhone() {
//        return contactPhone;
//    }

//    public void setContactPhone(String contactPhone) {
//        this.contactPhone = contactPhone;
//    }

//    public LocalDate getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(LocalDate orderDate) {
//        this.orderDate = orderDate;
//    }
//
//    public List<ProductRequestItemDto> getProducts() {
//        return products;
//    }

//    public void setProducts(List<ProductRequestItemDto> products) {
//        this.products = products;
//    }
}
