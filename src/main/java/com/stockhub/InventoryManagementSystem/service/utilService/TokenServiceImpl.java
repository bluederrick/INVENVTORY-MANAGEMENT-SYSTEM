package com.stockhub.InventoryManagementSystem.service.utilService;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.UUID;

@Service

public class TokenServiceImpl implements TokenService{
    private static final SecureRandom random = new SecureRandom();

    @Override
    public String generateTOKEN() {

        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }

}
