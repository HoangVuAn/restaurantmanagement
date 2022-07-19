package com.doan1.restaurantmanagement.api;

import com.doan1.restaurantmanagement.dto.CategoryDTO;
import com.doan1.restaurantmanagement.dto.CustomerDTO;
import com.doan1.restaurantmanagement.service.ICustomerService;
import com.doan1.restaurantmanagement.service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerAPI {
    @Autowired
    private ICustomerService customerService;

    @GetMapping(value = "/customer")
    public List<CustomerDTO> showCustomer(){
        return customerService.findAll();
    }

    @PostMapping(value = "/customer")
    public CustomerDTO createCustomer(@RequestBody CustomerDTO model){
        return customerService.save(model);
    }

    @PutMapping(value = "/customer/{id}")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO model,@PathVariable("id") long id){
        model.setId(id);
        return customerService.save(model);
    }

    @DeleteMapping(value = "/customer")
    public void deleteCustomer(@RequestBody long[] ids) {
        customerService.delete(ids);
    }

}
