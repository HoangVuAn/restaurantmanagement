package com.doan1.restaurantmanagement.repository;

import com.doan1.restaurantmanagement.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    CustomerEntity findOneById(long id);
}
