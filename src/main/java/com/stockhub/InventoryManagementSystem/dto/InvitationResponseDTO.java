package com.stockhub.InventoryManagementSystem.dto;

public class InvitationResponseDTO {

    private boolean success;
    private String message;
    private String token;

    public InvitationResponseDTO(boolean success, String message, String token) {
        this.success = success;
        this.message = message;
        this.token = token;
    }

    // Getters
    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }
    public String getToken() { return token; }

    // Setters if needed
    public void setSuccess(boolean success) { this.success = success; }
    public void setMessage(String message) { this.message = message; }
    public void setToken(String token) { this.token = token; }
}
