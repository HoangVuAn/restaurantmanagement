package com.doan1.restaurantmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "manager")
public class ManagerEntity extends BaseEntity{
    @Column(name = "Account")
    private String account;

    @Column(name = "Password")
    private String password;

    @Column(name = "Name")
    private String name;

    @Column(name = "PhoneNumber")
    private Long phoneNumber;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
