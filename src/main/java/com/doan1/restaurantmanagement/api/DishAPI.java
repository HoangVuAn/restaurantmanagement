package com.doan1.restaurantmanagement.api;

import com.doan1.restaurantmanagement.dto.DishDTO;
import com.doan1.restaurantmanagement.service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;


@RestController
public class DishAPI {
    @Autowired
    private IDishService dishService;

    @GetMapping(value = "/dish/{id}")
    public DishDTO showDish(@PathVariable("id") long id) {
        return dishService.findOne(id);
    }

    @GetMapping(value = "/dish")
    public List<DishDTO> showAllDish(){
        return dishService.findAll();
    }

    @PostMapping(value = "/dish")
    public DishDTO createDish(DishDTO model, @RequestParam("file") MultipartFile multipart) {
        try {
            byte[] imageData = multipart.getBytes();
            model.setImage(imageData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dishService.save(model);
    }

    @PutMapping(value = "/dish/{id}")
    public DishDTO updateDish(DishDTO model,@RequestParam("file") MultipartFile multipart,@PathVariable("id") long id){
        model.setId(id);
        try {
            byte[] imageData = multipart.getBytes();
            model.setImage(imageData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dishService.save(model);
    }

    @DeleteMapping(value = "/dish")
    public void deleteDish(@RequestBody long[] ids) {
        dishService.delete(ids);
    }
}
