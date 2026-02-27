package com.stockhub.InventoryManagementSystem.Controllers;

import com.stockhub.InventoryManagementSystem.dto.Registration.RegisterRequestDTO;
import com.stockhub.InventoryManagementSystem.service.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockhub.InventoryManagementSystem.adapters.ApiResponse;



@RestController
@RequestMapping("${app.base-url}")

public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<?>> registerUser(@RequestBody RegisterRequestDTO req) {


        ApiResponse<?> response =
                registrationService.registerUser(req);

        return response.isSuccess()
                ? ResponseEntity.ok(response)
                : ResponseEntity.badRequest().body(response);
   }
}