package com.stockhub.InventoryManagementSystem.dto.Registration;

import com.stockhub.InventoryManagementSystem.Enums.ROLE;

public class RegisterRequestDTO {
     private String token;
    private ROLE role ;
    private String email ;
    private String firstName ;
    private String  lastName ;
    private String phoneNumber ;

    
    public RegisterRequestDTO() {
    }

    public RegisterRequestDTO(String token, ROLE role, String email, String firstName, String lastName, String phoneNumber) {
        this.token = token;
        this.role = role;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
