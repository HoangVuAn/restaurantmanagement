package com.doan1.restaurantmanagement.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bill")
public class BillEntity extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "DishId")
    private DishEntity dish;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name = "StaffId")
    private StaffEntity staff;

    @Column(name = "Day")
    private Date day;

    @Column(name = "Price")
    private Long price;

    public DishEntity getDish() {
        return dish;
    }

    public void setDish(DishEntity dish) {
        this.dish = dish;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public StaffEntity getStaff() {
        return staff;
    }

    public void setStaff(StaffEntity staff) {
        this.staff = staff;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
