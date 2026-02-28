package com.stockhub.InventoryManagementSystem.Repository;

import com.stockhub.InventoryManagementSystem.Enities.IncomingOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomingOrderRepo extends JpaRepository<IncomingOrder, Integer> {
}
