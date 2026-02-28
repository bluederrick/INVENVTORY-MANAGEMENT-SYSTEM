package com.stockhub.InventoryManagementSystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stockhub.InventoryManagementSystem.Enities.Invitation;

public interface InvitationRepo extends JpaRepository<Invitation , Integer> {

    
    Optional<Invitation> findByEmail(String email);

    Optional<Invitation> findByToken(String token);
    
}
