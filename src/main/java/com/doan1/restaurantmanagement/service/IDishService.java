package com.doan1.restaurantmanagement.service;

import com.doan1.restaurantmanagement.dto.DishDTO;

import java.util.List;

public interface IDishService {
    DishDTO save (DishDTO dishDTO);
    void delete(long[] ids);
    List<DishDTO> findAll();
}
