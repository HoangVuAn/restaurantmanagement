package com.doan1.restaurantmanagement.service.impl;

import com.doan1.restaurantmanagement.converter.CustomerConverter;
import com.doan1.restaurantmanagement.converter.StaffConverter;
import com.doan1.restaurantmanagement.dto.CustomerDTO;
import com.doan1.restaurantmanagement.dto.StaffDTO;
import com.doan1.restaurantmanagement.entity.CustomerEntity;
import com.doan1.restaurantmanagement.entity.StaffEntity;
import com.doan1.restaurantmanagement.repository.CustomerRepository;
import com.doan1.restaurantmanagement.repository.StaffRepository;
import com.doan1.restaurantmanagement.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StaffService implements IStaffService {

    @Autowired
    StaffRepository staffRepository;

    @Autowired
    StaffConverter staffConverter;

    @Override
    public StaffDTO save(StaffDTO staffDTO) {
        StaffEntity staffEntity = new StaffEntity();
        if(staffDTO.getId()!=null) {
            Optional<StaffEntity> oldStaffEntity = staffRepository.findById(staffDTO.getId());
            staffEntity = staffConverter.toEntity(staffDTO, oldStaffEntity.get());
        } else {
            staffEntity = staffConverter.toEntity(staffDTO);
        }
        staffEntity = staffRepository.save(staffEntity);
        return staffConverter.toDTO(staffEntity);
    }

    @Override
    public void delete(long[] ids) {
        for(long item : ids) {
            staffRepository.deleteById(item);
        }
    }

    @Override
    public List<StaffDTO> findAll() {
        List<StaffEntity> entities = staffRepository.findAll();
        List<StaffDTO> result = new ArrayList<>();
        for(StaffEntity item : entities){
            result.add(staffConverter.toDTO(item));
        }
        return result;
    }
}
