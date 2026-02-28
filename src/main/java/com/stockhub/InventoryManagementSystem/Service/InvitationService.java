package com.stockhub.InventoryManagementSystem.Service;

import java.util.Optional;

import com.stockhub.InventoryManagementSystem.Enities.Invitation;
import com.stockhub.InventoryManagementSystem.Notification.EmailNotification;
import com.stockhub.InventoryManagementSystem.dto.InvitationResponseDTO;
import com.stockhub.InventoryManagementSystem.dto.Invitiation.InvitationRequestDTO;
import com.stockhub.InventoryManagementSystem.Enums.INVITATIONSTATUS;
import com.stockhub.InventoryManagementSystem.Repository.InvitationRepo;
import com.stockhub.InventoryManagementSystem.Service.utilService.TokenServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class InvitationService {


     private final InvitationRepo invitationRepo;


     private final EmailNotification emailNotification ;

     private final TokenServiceImpl tokenService ;

    public InvitationService(InvitationRepo invitationRepo, TokenServiceImpl tokenService , EmailNotification emailNotification) {
        this.invitationRepo = invitationRepo;
        this.tokenService = tokenService;
        this.emailNotification =emailNotification ;
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



        emailNotification.sendOtpMail(req.getEmail(),token);

//      System.out.println("Invitation link: http://localhost:3000/register?token=" + token);

        return new InvitationResponseDTO(true, "Invitation sent successfully", token);

     }

}
