package com.stockhub.InventoryManagementSystem.Service.utilService;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service

public class TokenServiceImpl implements TokenService{
    private static final SecureRandom random = new SecureRandom();

    @Override
    public String generateTOKEN() {

        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }

}
