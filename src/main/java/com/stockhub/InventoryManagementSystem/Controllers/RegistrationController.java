package com.stockhub.InventoryManagementSystem.Controllers;

import com.stockhub.InventoryManagementSystem.dto.Invitiation.InvitationRequestDTO;
import com.stockhub.InventoryManagementSystem.dto.Registration.RegisterRequestDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockhub.InventoryManagementSystem.adapters.ApiResponse;
import com.stockhub.InventoryManagementSystem.service.InvitationService;

//accept invite

@RestController
@RequestMapping("${app.base-url}/registration")
public class RegistrationController {


 private final InvitationService invitationService;


    public RegistrationController(InvitationService invitationService) {
        this.invitationService = invitationService;
    }

    @PostMapping("/register")
public ResponseEntity<?> registerUser(@RequestBody InvitationRequestDTO req) {

       boolean success = invitationService.sendInvitation(req).isSuccess();

    if (!success) {
        return ResponseEntity.badRequest().body(
                new ApiResponse(false, "Registration failed", null)
        );
    }

    return ResponseEntity.ok(
            new ApiResponse(true, "Registration successful", success)
    );


}

}