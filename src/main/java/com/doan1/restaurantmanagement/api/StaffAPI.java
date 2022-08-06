package com.doan1.restaurantmanagement.api;

import com.doan1.restaurantmanagement.dto.StaffDTO;
import com.doan1.restaurantmanagement.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffAPI {
    @Autowired
    private IStaffService staffService;

    @GetMapping(value = "staff/{id}")
    public StaffDTO showStaff(@PathVariable("id") long id){
        return staffService.findOne(id);
    }

    @GetMapping(value = "/staff")
    public List<StaffDTO> showAllStaff(){
        return staffService.findAll();
    }

    @PostMapping(value = "/staff")
    public StaffDTO createStaff(@RequestBody StaffDTO model){
        return staffService.save(model);
    }

    @PutMapping(value = "/staff/{id}")
    public StaffDTO updateStaff(@RequestBody StaffDTO model,@PathVariable("id") long id){
        model.setId(id);
        return staffService.save(model);
    }

    @DeleteMapping(value = "/staff")
    public void deleteStaff(@RequestBody long[] ids) {
        staffService.delete(ids);
    }
}
