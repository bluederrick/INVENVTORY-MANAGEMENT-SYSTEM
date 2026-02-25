package com.stockhub.InventoryManagementSystem.repository;

import com.stockhub.InventoryManagementSystem.Enities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface staffRepo extends JpaRepository<Staff, Integer> {
}
