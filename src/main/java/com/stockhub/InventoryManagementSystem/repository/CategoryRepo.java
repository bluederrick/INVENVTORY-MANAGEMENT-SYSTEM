package com.stockhub.InventoryManagementSystem.repository;


import com.stockhub.InventoryManagementSystem.Enities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category , Integer> {
}
