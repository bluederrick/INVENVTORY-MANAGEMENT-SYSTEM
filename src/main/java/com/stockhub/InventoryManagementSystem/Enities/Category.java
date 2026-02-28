package com.stockhub.InventoryManagementSystem.Enities;


import com.stockhub.InventoryManagementSystem.Enums.CATEGORY;

import jakarta.persistence.Entity;


@Entity
public class Category extends BaseModel {

    private CATEGORY category;


    public Category() {
    }

    public Category(CATEGORY category) {
        this.category = category;
    }

    public CATEGORY getCategory() {
        return category;
    }

    public void setCategory(CATEGORY category) {
        this.category = category;
    }
}
