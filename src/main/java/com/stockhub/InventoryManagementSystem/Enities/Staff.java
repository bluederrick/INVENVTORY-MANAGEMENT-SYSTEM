package com.stockhub.InventoryManagementSystem.Enities;

import java.time.LocalDate;

import com.stockhub.InventoryManagementSystem.enums.ROLE;
import jakarta.persistence.Entity;


@Entity
public class Staff extends BaseModel {

    private String userName;

    private String email;

    private String password ;

    private ROLE role ;

    private LocalDate dateCreated ;

    private LocalDate dateUpdated ;

    

    public Staff(String userName, String email, String password, ROLE role, LocalDate dateCreated,
            LocalDate dateUpdated) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    
    
}
