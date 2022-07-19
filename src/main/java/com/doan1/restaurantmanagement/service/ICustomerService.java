package com.doan1.restaurantmanagement.service;

import com.doan1.restaurantmanagement.dto.CustomerDTO;
import com.doan1.restaurantmanagement.dto.DishDTO;

import java.util.List;

public interface ICustomerService {
    CustomerDTO save (CustomerDTO customerDTO);
    void delete(long[] ids);
    List<CustomerDTO> findAll();
}
