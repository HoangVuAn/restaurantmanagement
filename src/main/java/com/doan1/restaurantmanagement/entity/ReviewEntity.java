package com.doan1.restaurantmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class ReviewEntity extends BaseEntity {


    @Column(name = "Comment")
    private String comment;

    @Column(name = "Star")
    private int star;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name = "DishId")
    private DishEntity dish;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

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
