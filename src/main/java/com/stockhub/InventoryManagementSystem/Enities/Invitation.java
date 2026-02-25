package com.stockhub.InventoryManagementSystem.Enities;

import java.time.LocalDate;

import com.stockhub.InventoryManagementSystem.enums.INVITATIONSTATUS;
import com.stockhub.InventoryManagementSystem.enums.ROLE;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Invitation  extends  BaseModel{

private String email ;
@Enumerated(EnumType.STRING)
private ROLE role ;
private String token ;

@Enumerated(EnumType.STRING)
private INVITATIONSTATUS status ;
private  LocalDate expiryDate ;
private Boolean created ;



public Invitation() {
}
public Invitation(String email, ROLE role, String token, INVITATIONSTATUS status, LocalDate expiryDate,
        Boolean created) {
    this.email = email;
    this.role = role;
    this.token = token;
    this.status = status;
    this.expiryDate = expiryDate;
    this.created = created;
}
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
public String getToken() {
    return token;
}
public void setToken(String token) {
    this.token = token;
}
public INVITATIONSTATUS getStatus() {
    return status;
}
public void setStatus(INVITATIONSTATUS status) {
    this.status = status;
}
public LocalDate getExpiryDate() {
    return expiryDate;
}
public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
}
public Boolean getCreated() {
    return created;
}
public void setCreated(Boolean created) {
    this.created = created;
}





}
