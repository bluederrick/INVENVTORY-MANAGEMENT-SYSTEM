package com.stockhub.InventoryManagementSystem.dto.Registration;

public class RegistrationResponseDTO {
    private String role;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    // constructor
    public RegistrationResponseDTO(String role, String email,
                                   String firstName, String lastName,
                                   String phoneNumber) {
        this.role = role;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
}
