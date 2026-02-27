package com.stockhub.InventoryManagementSystem.Controllers;

import com.stockhub.InventoryManagementSystem.dto.InvitationResponseDTO;
import com.stockhub.InventoryManagementSystem.dto.Invitiation.InvitationRequestDTO;
import com.stockhub.InventoryManagementSystem.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${app.base-url}")

public class invitationController {

    @Autowired
    private InvitationService invitationService;

    @PostMapping("/invite")
    public ResponseEntity<InvitationResponseDTO> sendInvitation(
            @RequestBody InvitationRequestDTO request) {

        InvitationResponseDTO response = invitationService.sendInvitation(request);

        if (!response.isSuccess()) {
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }


}
