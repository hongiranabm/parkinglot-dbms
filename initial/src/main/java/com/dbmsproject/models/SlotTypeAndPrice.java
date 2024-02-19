package com.dbmsproject.models;

public class SlotTypeAndPrice{
    private int slotTypeId;
    private int locCode;
    private int fare;
    public int getSlotTypeId() {
        return slotTypeId;
    }
    public void setSlotTypeId(int slotTypeId) {
        this.slotTypeId = slotTypeId;
    }
    public int getLocCode() {
        return locCode;
    }
    public void setLocCode(int locCode) {
        this.locCode = locCode;
    }
    public int getFare() {
        return fare;
    }
    public void setFare(int fare) {
        this.fare = fare;
    }
    public SlotTypeAndPrice() {
    }
    public SlotTypeAndPrice(int slotTypeId, int fare, int locCode) {
        this.slotTypeId = slotTypeId;
        this.locCode = locCode;
        this.fare = fare;
    }
    
}