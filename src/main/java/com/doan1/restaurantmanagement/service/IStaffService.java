package com.doan1.restaurantmanagement.service;

import com.doan1.restaurantmanagement.dto.DishDTO;
import com.doan1.restaurantmanagement.dto.StaffDTO;

import java.util.List;

public interface IStaffService {
    StaffDTO save (StaffDTO staffDTO);
    void delete(long[] ids);
    List<StaffDTO> findAll();
}
