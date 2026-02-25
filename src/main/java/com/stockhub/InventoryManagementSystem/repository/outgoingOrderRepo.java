package com.stockhub.InventoryManagementSystem.repository;

import com.stockhub.InventoryManagementSystem.Enities.OutgoingOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface outgoingOrderRepo  extends JpaRepository<OutgoingOrder , Integer>{
}
