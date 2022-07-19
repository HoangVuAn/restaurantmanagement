package com.doan1.restaurantmanagement.converter;

import com.doan1.restaurantmanagement.dto.CustomerDTO;
import com.doan1.restaurantmanagement.dto.StaffDTO;
import com.doan1.restaurantmanagement.entity.CustomerEntity;
import com.doan1.restaurantmanagement.entity.StaffEntity;
import org.springframework.stereotype.Component;

@Component
public class StaffConverter {
    public StaffEntity toEntity(StaffDTO dto) {
        StaffEntity entity = new StaffEntity();
        entity.setAccount(dto.getAccount());
        entity.setPassword(dto.getPassword());
        entity.setName(dto.getName());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setDateOfBirth(dto.getDateOfBirth());
        entity.setAddress(dto.getAddress());
        entity.setSex(dto.getSex());
        return entity;
    }

    public StaffDTO toDTO(StaffEntity entity) {
        StaffDTO dto = new StaffDTO();
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
        return dto;
    }
    public StaffEntity toEntity(StaffDTO dto, StaffEntity entity) {
        entity.setAccount(dto.getAccount());
        entity.setPassword(dto.getPassword());
        entity.setName(dto.getName());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setDateOfBirth(dto.getDateOfBirth());
        entity.setAddress(dto.getAddress());
        entity.setSex(dto.getSex());
        return entity;
    }
}
