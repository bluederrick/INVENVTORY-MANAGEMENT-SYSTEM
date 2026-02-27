package com.stockhub.InventoryManagementSystem.adapters;

public class ApiResponse<T> {

    private boolean success;
    private String message;
    private Object data;



    public ApiResponse(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    // Getters
    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }
    public Object getData()    { return data; }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
