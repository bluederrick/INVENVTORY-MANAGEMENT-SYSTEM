package com.stockhub.InventoryManagementSystem.Repository;

import com.stockhub.InventoryManagementSystem.Enities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
