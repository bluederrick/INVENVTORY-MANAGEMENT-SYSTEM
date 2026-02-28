package com.stockhub.InventoryManagementSystem.Repository;

import com.stockhub.InventoryManagementSystem.Enities.OutgoingOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutgoingOrderRepo extends JpaRepository<OutgoingOrder , Integer>{
}
