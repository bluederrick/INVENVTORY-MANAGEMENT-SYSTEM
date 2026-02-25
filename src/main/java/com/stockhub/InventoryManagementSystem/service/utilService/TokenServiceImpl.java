package com.stockhub.InventoryManagementSystem.service.utilService;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service

public class TokenServiceImpl implements TokenService{
    @Override
    public String generateTOKEN() {

        return UUID.randomUUID().toString();
    }

}
