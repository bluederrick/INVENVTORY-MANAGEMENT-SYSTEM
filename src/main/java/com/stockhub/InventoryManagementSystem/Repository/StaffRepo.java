package com.stockhub.InventoryManagementSystem.Repository;

import com.stockhub.InventoryManagementSystem.Enities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer> {
}
