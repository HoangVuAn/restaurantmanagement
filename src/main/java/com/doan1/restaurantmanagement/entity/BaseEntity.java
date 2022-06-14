package com.doan1.restaurantmanagement.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
    @Id 		//primary key(not null + primary key)
    @GeneratedValue(strategy = GenerationType.IDENTITY)		//auto_increment (tu tang) -> khong can ham setter
    private Long id;

    public Long getId() {
        return id;
    }
}
