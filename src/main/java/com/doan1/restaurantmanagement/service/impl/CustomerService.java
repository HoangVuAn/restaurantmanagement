package com.doan1.restaurantmanagement.service.impl;

import com.doan1.restaurantmanagement.converter.CustomerConverter;
import com.doan1.restaurantmanagement.dto.CustomerDTO;
import com.doan1.restaurantmanagement.entity.CustomerEntity;
import com.doan1.restaurantmanagement.repository.CustomerRepository;
import com.doan1.restaurantmanagement.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerConverter customerConverter;

    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        CustomerEntity customerEntity = new CustomerEntity();
        if(customerDTO.getId()!=null) {
            Optional<CustomerEntity> oldCustomerEntity = customerRepository.findById(customerDTO.getId());
            customerEntity = customerConverter.toEntity(customerDTO, oldCustomerEntity.get());
        } else {
            customerEntity = customerConverter.toEntity(customerDTO);
        }
        customerEntity = customerRepository.save(customerEntity);
        return customerConverter.toDTO(customerEntity);
    }

    @Override
    public void delete(long[] ids) {
        for(long item : ids) {
            customerRepository.deleteById(item);
        }
    }

    @Override
    public List<CustomerDTO> findAll() {
        List<CustomerEntity> entities = customerRepository.findAll();
        List<CustomerDTO> result = new ArrayList<>();
        for(CustomerEntity item : entities){
            result.add(customerConverter.toDTO(item));
        }
        return result;
    }

    @Override
    public CustomerDTO findOne(long id) {
        CustomerEntity entity = customerRepository.findOneById(id);
        return customerConverter.toDTO(entity);
    }
}
