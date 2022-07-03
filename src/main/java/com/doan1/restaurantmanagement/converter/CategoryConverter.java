package com.doan1.restaurantmanagement.converter;

import com.doan1.restaurantmanagement.dto.CategoryDTO;
import com.doan1.restaurantmanagement.entity.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {
    public CategoryEntity toEntity(CategoryDTO dto) {
        CategoryEntity entity = new CategoryEntity();
        entity.setName(dto.getName());
        return entity;
    }

    public CategoryDTO toDTO(CategoryEntity entity) {
        CategoryDTO dto = new CategoryDTO();
        if(entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setName(entity.getName());
        return dto;
    }

    public CategoryEntity toEntity(CategoryDTO dto, CategoryEntity entity) {
        entity.setName(dto.getName());
        return entity;
    }

}
