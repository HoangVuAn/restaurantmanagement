package com.doan1.restaurantmanagement.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dish")
public class DishEntity extends BaseEntity{
    @Column(name = "Name",nullable = false)
    private String name;

    @Column(name = "ShortDescription",nullable = false)
    private String shortDescription;

    @Column(name = "Price",nullable = false)
    private Long price;

    @Lob
    private byte[] image;

    @ManyToOne
    @JoinColumn(name = "CategoryId",nullable = false)
    private CategoryEntity category;

    @OneToMany(mappedBy = "dish")
    private List<ReviewEntity> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "dish")
    private List<TableEntity> tables = new ArrayList<>();

    @OneToMany(mappedBy = "dish")
    private List<BillEntity> bills = new ArrayList<>();

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

    public List<ReviewEntity> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewEntity> reviews) {
        this.reviews = reviews;
    }

    public List<TableEntity> getTables() {
        return tables;
    }

    public void setTables(List<TableEntity> tables) {
        this.tables = tables;
    }

    public List<BillEntity> getBills() {
        return bills;
    }

    public void setBills(List<BillEntity> bills) {
        this.bills = bills;
    }


    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
