package com.doan1.restaurantmanagement.repository;

import com.doan1.restaurantmanagement.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffEntity, Long> {
    StaffEntity findOneById(long id);
}
