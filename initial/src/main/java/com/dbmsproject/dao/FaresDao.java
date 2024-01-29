package com.dbmsproject.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FaresDao {
    
    @ManyToOne
    @JoinColumn(name = "locCode")
    private LocationDao locationDao;

    @ManyToOne
    @JoinColumn(name = "slotTypeId")
    private SlotTypeDao slotTypeDao;

    private int amount;    

    public FaresDao(LocationDao locationDao,SlotTypeDao slotTypeDao,int amount){
        this.locationDao = locationDao;
        this.slotTypeDao = slotTypeDao;
        this.amount = amount;
    }

    public FaresDao(){

    }

    public LocationDao getLocCode() {
        return locationDao;
    }

    public void setLocCode(LocationDao locationDao) {
        this.locationDao = locationDao;
    }

    public SlotTypeDao getSlotTypeId() {
        return slotTypeDao;
    }

    public void setSlotTypeId(SlotTypeDao slotTypeDao) {
        this.slotTypeDao = slotTypeDao;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
}
