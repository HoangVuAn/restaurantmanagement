package com.doan1.restaurantmanagement.service;

import com.doan1.restaurantmanagement.dto.CustomerDTO;

import java.util.List;

public interface ICustomerService {
    CustomerDTO save (CustomerDTO customerDTO);
    void delete(long[] ids);
    List<CustomerDTO> findAll();
    CustomerDTO findOne(long id);
}
