package com.doan1.restaurantmanagement.api;

import com.doan1.restaurantmanagement.dto.CategoryDTO;
import com.doan1.restaurantmanagement.dto.DishDTO;
import com.doan1.restaurantmanagement.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class CategoryAPI {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping(value = "/category")
    public List<CategoryDTO> showCategory(){
        return categoryService.findAll();
    }

    @PostMapping(value = "/category")
    public CategoryDTO createCategory(@RequestBody CategoryDTO model){
        return categoryService.save(model);
    }

    @PutMapping(value = "/category/{id}")
    public CategoryDTO updateCategory(@RequestBody CategoryDTO model,@PathVariable("id") long id){
        model.setId(id);
        return categoryService.save(model);
    }

    @DeleteMapping(value = "/category")
    public void deleteCategory(@RequestBody long[] ids) {
        categoryService.delete(ids);
    }
}
