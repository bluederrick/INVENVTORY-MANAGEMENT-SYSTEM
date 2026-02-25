package com.stockhub.InventoryManagementSystem.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import com.stockhub.InventoryManagementSystem.Enities.Invitation;
import com.stockhub.InventoryManagementSystem.dto.InvitationResponseDTO;
import com.stockhub.InventoryManagementSystem.dto.Invitiation.InvitationRequestDTO;
import com.stockhub.InventoryManagementSystem.enums.INVITATIONSTATUS;
import com.stockhub.InventoryManagementSystem.enums.ROLE;
import com.stockhub.InventoryManagementSystem.repository.InvitationRepo;
import com.stockhub.InventoryManagementSystem.service.utilService.TokenServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class InvitationService {


     private final InvitationRepo invitationRepo;


     private  TokenServiceImpl tokenService ;

    public InvitationService(InvitationRepo invitationRepo) {
        this.invitationRepo = invitationRepo;
    }


    public InvitationResponseDTO sendInvitation(InvitationRequestDTO req){

        Optional<Invitation> existing = invitationRepo.findByEmail(req.getEmail());

if (existing.isPresent()) {
    throw new RuntimeException("Invitation already sent to this email");
}

//GENERATE TOKEN FOR SUBMISSION

          String token = tokenService.generateTOKEN();

    Invitation invite = new Invitation(); 
    invite.setEmail(req.getEmail());
    invite.setRole(req.getRole());
    invite.setToken(token);
    invite.setStatus(INVITATIONSTATUS.PENDING);
    // invite.setExpiryDate(LocalDateTime.now());

    invitationRepo.save(invite);


        System.out.println("Invitation link: http://localhost:3000/register?token=" + token);

        return new InvitationResponseDTO(true, "Invitation sent successfully", token);
    


     }


}
