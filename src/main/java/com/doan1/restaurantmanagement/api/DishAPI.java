package com.doan1.restaurantmanagement.api;

import com.doan1.restaurantmanagement.S3.S3Util;
import com.doan1.restaurantmanagement.dto.DishDTO;
import com.doan1.restaurantmanagement.service.IDishService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;


@RestController
public class DishAPI {
    @Autowired
    private IDishService dishService;

    @GetMapping(value = "/dish")
    public List<DishDTO> showDish(){
        return dishService.findAll();
    }

    @PostMapping(value = "/dish")
    public DishDTO createDish(DishDTO model, @RequestParam("file") MultipartFile multipart) {
//        try {
//            model.setImage(Base64.encodeBase64(multipart.getBytes()));
//            String result = new String(Base64.encodeBase64(multipart.getBytes()));
//            System.out.println(result);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String fileName = multipart.getOriginalFilename();
        try {
            S3Util.uploadFile(fileName,multipart.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
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
