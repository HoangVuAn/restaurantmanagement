package com.doan1.restaurantmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "staff")
public class StaffEntity extends BaseEntity{
    @Column(name = "Account")
    private String account;

    @Column(name = "Password")
    private String password;

    @Column(name = "Name")
    private String name;

    @Column(name = "PhoneNumber")
    private Long phoneNumber;

    @Column(name = "DateOfBirth")
    private Date dateOfBirth;

    @Column(name = "Address")
    private String address;

    @Column(name = "Sex")
    private String sex;

    @OneToMany(mappedBy = "staff")
    private List<BillEntity> bills = new ArrayList<>();

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<BillEntity> getBills() {
        return bills;
    }

    public void setBills(List<BillEntity> bills) {
        this.bills = bills;
    }
}
