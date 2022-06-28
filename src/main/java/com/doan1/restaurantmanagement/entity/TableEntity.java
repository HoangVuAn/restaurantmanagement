package com.doan1.restaurantmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbltable")
public class TableEntity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name = "DishId")
    private DishEntity dish;

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public DishEntity getDish() {
        return dish;
    }

    public void setDish(DishEntity dish) {
        this.dish = dish;
    }
}
