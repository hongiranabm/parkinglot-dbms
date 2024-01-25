package com.dbmsproject.dao;

import org.springframework.stereotype.Indexed;

@Entity
public class SlotTypeDao {
    
    @Id
    private int slotTypeId;
    private int vehType;

    public SlotTypeDao(int slotTypeId, int vehType) {
        this.slotTypeId = slotTypeId;
        this.vehType = vehType;
    }
    public SlotTypeDao() {
    }
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

    
}
