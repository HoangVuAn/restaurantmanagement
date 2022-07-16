package com.doan1.restaurantmanagement.service;

import com.doan1.restaurantmanagement.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {
    CategoryDTO save(CategoryDTO categoryDTO);
    void delete(long[] ids);
    List<CategoryDTO> findAll();
}
