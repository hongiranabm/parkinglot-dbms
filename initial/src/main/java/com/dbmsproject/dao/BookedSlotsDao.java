package com.dbmsproject.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookedSlotsDao {
    @Id
    private int bookingId;
    
    private int locCode;
    private int slotTypeId;
    private int phone;
    private int level;

    public BookedSlotsDao(int bookingId,int locCode,int slotTypeId,int phone,int level)
    {
        this.bookingId = bookingId;
        this.locCode = locCode;
        this.slotTypeId = slotTypeId;
        this.phone = phone;
        this.level = level;

    }

    public BookedSlotsDao(){

    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getLocCode() {
        return locCode;
    }

    public void setLocCode(int locCode) {
        this.locCode = locCode;
    }

    public int getSlotTypeId() {
        return slotTypeId;
    }

    public void setSlotTypeId(int slotTypeId) {
        this.slotTypeId = slotTypeId;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    

}
