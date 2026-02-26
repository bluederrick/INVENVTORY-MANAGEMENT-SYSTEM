package com.stockhub.InventoryManagementSystem.Controllers;

import com.stockhub.InventoryManagementSystem.dto.Invitiation.InvitationRequestDTO;
import com.stockhub.InventoryManagementSystem.dto.Registration.RegisterRequestDTO;
import com.stockhub.InventoryManagementSystem.service.RegistrationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockhub.InventoryManagementSystem.adapters.ApiResponse;
import com.stockhub.InventoryManagementSystem.service.InvitationService;

//accept invite
//RegistrationController
//→ Validate toke
//→ Create User
//→ Mark invitation as ACCEPTED
//→ Save User in DB







@RestController
@RequestMapping("${app.base-url}")

public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterRequestDTO req) {

        boolean success = registrationService.registerUser(req);

        if (!success) {
            return ResponseEntity.badRequest()
                    .body(new ApiResponse(false, "Registration failed", null));
        }

        return ResponseEntity.ok(
                new ApiResponse(true, "Registration successful", null)
        );
    }
}