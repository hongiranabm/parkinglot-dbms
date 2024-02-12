package com.dbmsproject.models;

public class Location {

    private int locCode;
    private String area;
    
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
    public Location() {
    }
    public Location(int locCode, String area) {
        this.locCode = locCode;
        this.area = area;
    }

    
}
