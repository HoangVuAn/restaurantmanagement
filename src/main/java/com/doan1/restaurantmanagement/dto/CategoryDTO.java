package com.doan1.restaurantmanagement.dto;

public class CategoryDTO extends AbstractDTO<CategoryDTO>{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
