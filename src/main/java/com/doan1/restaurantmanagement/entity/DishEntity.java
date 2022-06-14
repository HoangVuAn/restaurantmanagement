package com.doan1.restaurantmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dish")
public class DishEntity extends BaseEntity{
    @Column(name = "Name")
    private String name;

    @Column(name = "ShortDescription")
    private String shortDescription;

    @Column(name = "Price")
    private Long price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
