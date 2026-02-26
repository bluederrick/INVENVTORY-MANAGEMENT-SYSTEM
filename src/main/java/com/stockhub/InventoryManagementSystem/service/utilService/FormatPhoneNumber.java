package com.stockhub.InventoryManagementSystem.service.utilService;

import org.springframework.stereotype.Service;

@Service
public class FormatPhoneNumber {

    public static String formatPhoneNumber(String phoneNumber) {

        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new RuntimeException("Phone number cannot be empty");
        }

        // Remove spaces, dashes, brackets
        phoneNumber = phoneNumber.replaceAll("[^0-9+]", "");


        if (phoneNumber.startsWith("0")) {
            phoneNumber = "+234" + phoneNumber.substring(1);
        }

        return phoneNumber;
    }

}