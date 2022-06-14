package com.doan1.restaurantmanagement.repository;

import com.doan1.restaurantmanagement.entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DishRepository extends JpaRepository<DishEntity, Long>{
}
