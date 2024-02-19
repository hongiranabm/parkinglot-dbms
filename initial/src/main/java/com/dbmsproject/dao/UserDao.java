package com.dbmsproject.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class UserDao {
    @Id
    private Long phone;
    private String name;
    private String password;

    public UserDao(String name,Long phone, String password){
        this.name = name;
        this.phone = phone;
        this.password = password;

    }

    public UserDao(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
}
