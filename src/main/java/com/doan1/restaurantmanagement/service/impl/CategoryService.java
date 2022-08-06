package com.doan1.restaurantmanagement.service.impl;

import com.doan1.restaurantmanagement.converter.CategoryConverter;
import com.doan1.restaurantmanagement.dto.CategoryDTO;
import com.doan1.restaurantmanagement.entity.CategoryEntity;
import com.doan1.restaurantmanagement.repository.CategoryRepository;
import com.doan1.restaurantmanagement.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryConverter categoryConverter;

    @Override
    public CategoryDTO save(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = new CategoryEntity();
        if(categoryDTO.getId()!=null) {
            CategoryEntity oldCategoryEntity = categoryRepository.findOneById(categoryDTO.getId());
            categoryEntity = categoryConverter.toEntity(categoryDTO, oldCategoryEntity);
        } else {
            categoryEntity = categoryConverter.toEntity(categoryDTO);
        }
        categoryEntity = categoryRepository.save(categoryEntity);
        return categoryConverter.toDTO(categoryEntity);
    }

    @Override
    public void delete(long[] ids) {
        for(long item : ids) {
            categoryRepository.deleteById(item);
        }
    }

    @Override
    public List<CategoryDTO> findAll() {
        List<CategoryEntity> entities = categoryRepository.findAll();
        List<CategoryDTO> result = new ArrayList<>();
        for(CategoryEntity item : entities){
            result.add(categoryConverter.toDTO(item));
        }
        return result;
    }

    @Override
    public CategoryDTO findOne(long id) {
        CategoryEntity entity = categoryRepository.findOneById(id);
        return categoryConverter.toDTO(entity);
    }

}
