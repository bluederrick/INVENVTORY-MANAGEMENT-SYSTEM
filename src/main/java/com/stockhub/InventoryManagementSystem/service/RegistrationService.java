package com.stockhub.InventoryManagementSystem.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

import com.stockhub.InventoryManagementSystem.Enities.Staff;
import com.stockhub.InventoryManagementSystem.Enities.Supplier;
import com.stockhub.InventoryManagementSystem.adapters.ApiResponse;
import com.stockhub.InventoryManagementSystem.dto.Registration.RegistrationResponseDTO;
import com.stockhub.InventoryManagementSystem.repository.StaffRepo;
import com.stockhub.InventoryManagementSystem.repository.SupplierRepo;
import com.stockhub.InventoryManagementSystem.service.utilService.FormatPhoneNumber;
import org.springframework.stereotype.Service;

import com.stockhub.InventoryManagementSystem.Enities.Invitation;
import com.stockhub.InventoryManagementSystem.dto.Registration.RegisterRequestDTO;
import com.stockhub.InventoryManagementSystem.enums.INVITATIONSTATUS;
import com.stockhub.InventoryManagementSystem.repository.InvitationRepo;

@Service
public class RegistrationService {

    private final InvitationRepo invitationRepo;
    private final StaffRepo staffRepo ;
    private SupplierRepo supplierRepo ;


    public RegistrationService(InvitationRepo invitationRepo,StaffRepo staffRepo,SupplierRepo supplierRep) {
        this.invitationRepo = invitationRepo;
        this.staffRepo =staffRepo ;
        this.supplierRepo =supplierRep ;

    }

    public ApiResponse<?> registerUser(RegisterRequestDTO request){

        Invitation invitation = invitationRepo.findByToken(request.getToken())
                .orElseThrow(() -> new RuntimeException("Invalid token"));

        if (invitation.getStatus() != INVITATIONSTATUS.PENDING) {
            throw new RuntimeException("Invitation already used or expired");
        }

//        if (invitation.getExpiryDate().isBefore(LocalDate.now())) {
//            invitation.setStatus(INVITATIONSTATUS.EXPIRED);
//            invitationRepo.save(invitation);
//            throw new RuntimeException("Invitation expired");
//        }

        switch (invitation.getRole()) {

            case SUPPLIER:
                Supplier supplier = new Supplier();
                supplier.setEmail(request.getEmail());
                supplier.setFirstName(request.getFirstName());
                supplier.setLastName(request.getLastName());
                String formattedPhone =
                        FormatPhoneNumber.formatPhoneNumber(request.getPhoneNumber());

                supplier.setPhoneNumber(formattedPhone);
                supplierRepo.save(supplier);
                responseDTO = new RegistrationResponseDTO(
                        "SUPPLIER",
                        supplier.getEmail(),
                        supplier.getFirstName(),
                        supplier.getLastName(),
                        supplier.getPhoneNumber()
                );
                break;


            case STAFF:
                Staff staff = new Staff();
                staff.setEmail(request.getEmail());
                staff.setRole(request.getRole());
                staffRepo.save(staff);
                responseDTO = new RegistrationResponseDTO(
                        "STAFF",
                        staff.getEmail(),
                        null,
                        null,
                        null
                );
                break;

            default:
                throw new RuntimeException("Unsupported role type");
        }

        invitation.setStatus(INVITATIONSTATUS.ACCEPTED);
        invitationRepo.save(invitation);
        return new ApiResponse(true, "Registration successful", responseDTO);
    }
}