package com.dbmsproject.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FaresDao {

    @Id
    private int faresId;
    
    @ManyToOne
    @JoinColumn(name = "locCode")
    private LocationDao locationDao;

    @ManyToOne
    @JoinColumn(name = "slotTypeId")
    private SlotTypeDao slotTypeDao;

    private int amount;

    public FaresDao(int faresId, LocationDao locationDao,SlotTypeDao slotTypeDao,int amount){
        this.faresId = faresId;
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

    public int getFaresId() {
        return faresId;
    }

    public void setFaresId(int faresId) {
        this.faresId = faresId;
    }

    
}
