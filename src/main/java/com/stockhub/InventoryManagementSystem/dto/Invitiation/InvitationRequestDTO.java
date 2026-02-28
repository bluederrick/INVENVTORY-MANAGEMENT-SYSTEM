package com.stockhub.InventoryManagementSystem.dto.Invitiation;

import com.stockhub.InventoryManagementSystem.Enums.ROLE;

public class InvitationRequestDTO {
    private String email;
    private ROLE role;



    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ROLE getRole() {
        return role;
    }
    public void setRole(ROLE role) {
        this.role = role;
    }
    

}
