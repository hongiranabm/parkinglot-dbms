package com.dbmsproject.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FaresDao {
    @Id
    private int locCode;
    private int slotTypeId;
    private int amount;    

    public FaresDao(int locCode,int slotTypeId,int amount){
        this.locCode = locCode;
        this.slotTypeId = slotTypeId;
        this.amount = amount;
    }

    public FaresDao(){

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
}
