package com.doan1.restaurantmanagement.api;

import com.doan1.restaurantmanagement.dto.DishDTO;
import com.doan1.restaurantmanagement.service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class DishAPI {
    @Autowired
    private IDishService dishService;

    @GetMapping(value = "/dish")
    public List<DishDTO> showDish(){
        return dishService.findAll();
    }

    @PostMapping(value = "/dish")
    public DishDTO createDish(@RequestBody DishDTO model){
        return dishService.save(model);
    }

    @PutMapping(value = "/dish/{id}")
    public DishDTO updateDish(@RequestBody DishDTO model,@PathVariable("id") long id){
        model.setId(id);
        return dishService.save(model);
    }

    @DeleteMapping(value = "/dish")
    public void deleteDish(@RequestBody long[] ids) {
        dishService.delete(ids);
    }
}
