package com.stockhub.InventoryManagementSystem.repository;

import com.stockhub.InventoryManagementSystem.Enities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepo extends JpaRepository <Supplier , Integer>{
}
