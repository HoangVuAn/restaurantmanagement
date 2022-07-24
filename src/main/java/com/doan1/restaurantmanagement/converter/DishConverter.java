package com.doan1.restaurantmanagement.converter;

import com.doan1.restaurantmanagement.dto.DishDTO;
import com.doan1.restaurantmanagement.entity.DishEntity;
import org.springframework.stereotype.Component;

@Component
public class DishConverter {

    public DishEntity toEntity(DishDTO dto) {
        DishEntity entity = new DishEntity();
        entity.setName(dto.getName());
        entity.setShortDescription(dto.getShortDescription());
        entity.setPrice(dto.getPrice());
        entity.setImage(dto.getImage());
        return entity;
    }

    public DishDTO toDTO(DishEntity entity) {
        DishDTO dto = new DishDTO();
        if(entity.getId()!=null) {
            dto.setId(entity.getId());
        }
        dto.setName(entity.getName());
        dto.setShortDescription(entity.getShortDescription());
        dto.setPrice(entity.getPrice());
        dto.setImage(entity.getImage());
        if(entity.getCategory()!=null){
            dto.setCategoryName(entity.getCategory().getName());
        }
        return dto;
    }
    public DishEntity toEntity(DishDTO dto, DishEntity entity) {
        entity.setName(dto.getName());
        entity.setShortDescription(dto.getShortDescription());
        entity.setPrice(dto.getPrice());
        entity.setImage(dto.getImage());
        return entity;
    }
}
