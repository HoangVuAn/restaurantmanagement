package com.doan1.restaurantmanagement.repository;

import com.doan1.restaurantmanagement.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    CategoryEntity findOneByName(String name);
    CategoryEntity findOneById(Long id);
}
