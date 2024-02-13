package com.dbmsproject.models;

public class SlotTypeAndPrice{
    private int slotTypeId;
    private int vehType;
    private int fare;
    public int getSlotTypeId() {
        return slotTypeId;
    }
    public void setSlotTypeId(int slotTypeId) {
        this.slotTypeId = slotTypeId;
    }
    public int getVehType() {
        return vehType;
    }
    public void setVehType(int vehType) {
        this.vehType = vehType;
    }
    public int getFare() {
        return fare;
    }
    public void setFare(int fare) {
        this.fare = fare;
    }
    public SlotTypeAndPrice() {
    }
    public SlotTypeAndPrice(int slotTypeId, int vehType, int fare) {
        this.slotTypeId = slotTypeId;
        this.vehType = vehType;
        this.fare = fare;
    }
    
}