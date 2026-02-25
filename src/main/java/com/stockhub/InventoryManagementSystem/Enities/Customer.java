package com.stockhub.InventoryManagementSystem.Enities;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Customer extends BaseModel{

    private String firstName;

    private String lastName;

    private Integer age;

    private String email;

    private String phoneNumber;

    private String address;

    private LocalDate dateCreated;
}
