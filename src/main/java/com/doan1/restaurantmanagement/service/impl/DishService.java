package com.doan1.restaurantmanagement.service.impl;

import com.doan1.restaurantmanagement.converter.DishConverter;
import com.doan1.restaurantmanagement.dto.DishDTO;
import com.doan1.restaurantmanagement.entity.CategoryEntity;
import com.doan1.restaurantmanagement.entity.DishEntity;
import com.doan1.restaurantmanagement.repository.CategoryRepository;
import com.doan1.restaurantmanagement.repository.DishRepository;
import com.doan1.restaurantmanagement.service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DishService implements IDishService {

    @Autowired
    private DishRepository dishRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private DishConverter dishConverter;

    @Override
    public DishDTO save(DishDTO dishDTO) {
        DishEntity dishEntity = new DishEntity();
        if(dishDTO.getId()!=null) {
            Optional<DishEntity> oldDishEntity = dishRepository.findById(dishDTO.getId());
            dishEntity = dishConverter.toEntity(dishDTO, oldDishEntity.get());
        } else {
            dishEntity = dishConverter.toEntity(dishDTO);
        }
        CategoryEntity categoryEntity = categoryRepository.findOneByName(dishDTO.getCategoryName());
        dishEntity.setCategory(categoryEntity);
        dishEntity = dishRepository.save(dishEntity);
        return dishConverter.toDTO(dishEntity);
    }

    @Override
    public void delete(long[] ids) {
        for(long item : ids) {
            dishRepository.deleteById(item);
        }
    }

    @Override
    public List<DishDTO> findAll() {
        List<DishEntity> entities = dishRepository.findAll();
        List<DishDTO> result = new ArrayList<>();
        for(DishEntity item : entities){
            result.add(dishConverter.toDTO(item));
        }
        return result;
    }

    @Override
    public DishDTO findOne(long id) {
        DishEntity entity = dishRepository.findOneById(id);
        return dishConverter.toDTO(entity);
    }
}
