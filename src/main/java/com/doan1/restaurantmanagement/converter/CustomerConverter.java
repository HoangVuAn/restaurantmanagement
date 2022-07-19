package com.doan1.restaurantmanagement.converter;

import com.doan1.restaurantmanagement.dto.CustomerDTO;
import com.doan1.restaurantmanagement.dto.DishDTO;
import com.doan1.restaurantmanagement.entity.CustomerEntity;
import com.doan1.restaurantmanagement.entity.DishEntity;
import org.hibernate.annotations.Cache;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {
    public CustomerEntity toEntity(CustomerDTO dto) {
        CustomerEntity entity = new CustomerEntity();
        entity.setAccount(dto.getAccount());
        entity.setPassword(dto.getPassword());
        entity.setName(dto.getName());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setDateOfBirth(dto.getDateOfBirth());
        entity.setAddress(dto.getAddress());
        entity.setSex(dto.getSex());
        entity.setEmail(dto.getEmail());
        return entity;
    }

    public CustomerDTO toDTO(CustomerEntity entity) {
        CustomerDTO dto = new CustomerDTO();
        if(entity.getId()!=null) {
            dto.setId(entity.getId());
        }
        dto.setAccount(entity.getAccount());
        dto.setPassword(entity.getPassword());
        dto.setName(entity.getName());
        dto.setPhoneNumber(entity.getPhoneNumber());
        dto.setDateOfBirth(entity.getDateOfBirth());
        dto.setAddress(entity.getAddress());
        dto.setSex(entity.getSex());
        dto.setEmail(entity.getEmail());
        return dto;
    }
    public CustomerEntity toEntity(CustomerDTO dto, CustomerEntity entity) {
        entity.setAccount(dto.getAccount());
        entity.setPassword(dto.getPassword());
        entity.setName(dto.getName());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setDateOfBirth(dto.getDateOfBirth());
        entity.setAddress(dto.getAddress());
        entity.setSex(dto.getSex());
        entity.setEmail(dto.getEmail());
        return entity;
    }
}
