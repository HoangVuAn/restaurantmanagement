package com.doan1.restaurantmanagement.repository;

import com.doan1.restaurantmanagement.entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<DishEntity, Long>{
}
