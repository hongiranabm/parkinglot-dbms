package com.dbmsproject.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LocationDao {
    @Id
    private int locCode;
    private String area;
    private int noOfFloors;

    public LocationDao(int locCode,String area,int noOfFloors){
        this.locCode = locCode;
        this.area = area;
        this.noOfFloors = noOfFloors;

    }
    public LocationDao(){

    }
    public int getLocCode() {
        return locCode;
    }
    public void setLocCode(int locCode) {
        this.locCode = locCode;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public int getNoOfFloors() {
        return noOfFloors;
    }
    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    
}
