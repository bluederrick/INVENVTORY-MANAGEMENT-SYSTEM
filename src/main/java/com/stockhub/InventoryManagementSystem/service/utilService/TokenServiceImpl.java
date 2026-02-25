package com.stockhub.InventoryManagementSystem.service.utilService;

import java.util.UUID;

public class TokenServiceImpl implements TokenService{
    @Override
    public String generateTOKEN() {
        String token = UUID.randomUUID().toString();

        return token ;
    }

}
