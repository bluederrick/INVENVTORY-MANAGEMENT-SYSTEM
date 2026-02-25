package com.stockhub.InventoryManagementSystem.Enities;

import java.time.LocalDate;

import com.stockhub.InventoryManagementSystem.enums.ROLE;
import jakarta.persistence.Entity;

@Entity

public class Supplier extends BaseModel {


    private String firstName ;

    private String lastName ;

    private Integer age  ;

    private String email ;

    private String phoneNumber ;

    private String address ;

    private ROLE role ;

    private LocalDate dateCreated ;

    private LocalDate dateUpdated ;

    

    public Supplier() {
    }

    public Supplier(String firstName, String lastName, Integer age, String email, String phoneNumber, String address, ROLE role, LocalDate dateCreated ,LocalDate dateUpdated) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.role =role ;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated ;
    }


    
   
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    
    
}
