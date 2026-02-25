package com.stockhub.InventoryManagementSystem.service;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

import org.springframework.stereotype.Service;

import com.stockhub.InventoryManagementSystem.Enities.Invitation;
import com.stockhub.InventoryManagementSystem.dto.Registration.RegisterRequestDTO;
import com.stockhub.InventoryManagementSystem.enums.INVITATIONSTATUS;
import com.stockhub.InventoryManagementSystem.repository.InvitationRepo;

@Service
public class RegistrationService {


 private final InvitationRepo invitationRepo;

    public RegistrationService(InvitationRepo invitationRepo) {
        this.invitationRepo = invitationRepo;
    }


    public void RegisterUSer(RegisterRequestDTO request){

Invitation invitation = invitationRepo.findByToken(request.getToken())
                .orElseThrow(() -> new RuntimeException("Invalid token"));

        if (invitation.getStatus() != INVITATIONSTATUS.PENDING) {
            throw new RuntimeException("Invitation already used or expired");
        }

        if (invitation.getExpiryDate().isBefore(ChronoLocalDate.from(LocalDateTime.now()))) {
            invitation.setStatus(INVITATIONSTATUS.EXPIRED);
            invitationRepo.save(invitation);
            throw new RuntimeException("Invitation expired");
        }


    }


}
