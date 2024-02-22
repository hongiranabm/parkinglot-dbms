package com.dbmsproject.models;

public class BookSlot {
    private int locCode;
    private int slotTypeId;
    private Long phone;
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
    public BookSlot(int locCode, int slotTypeId, Long phone) {
        this.locCode = locCode;
        this.slotTypeId = slotTypeId;
        this.phone = phone;
    }
    public BookSlot() {
    }
    
}
