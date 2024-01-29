package com.dbmsproject.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class LoginDao {
    @Id
    private int phone;
    private String name;
    private String password;

    public LoginDao(String name,int phone, String password){
        this.name = name;
        this.phone = phone;
        this.password = password;

    }

    public LoginDao(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
}
