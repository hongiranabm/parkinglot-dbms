package com.dbmsproject.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BookSlotDao {
    @Id @GeneratedValue
    private int bookingId;
    
    private int locCode;
    private int slotTypeId;
    private Long phone;

    public BookSlotDao(int locCode, int slotTypeId, Long phone)
    {
        this.locCode = locCode;
        this.slotTypeId = slotTypeId;
        this.phone = phone;
    }

    public BookSlotDao(){

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

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}
