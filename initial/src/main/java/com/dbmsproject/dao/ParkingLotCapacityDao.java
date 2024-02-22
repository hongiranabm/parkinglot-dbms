package com.dbmsproject.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ParkingLotCapacityDao {
    @Id
    private int parkingLotCapacityId;
    private int locCode;
    private int slotTypeId;
    private int level;
    private int capacity;

    public ParkingLotCapacityDao(int parkingLotCapacityId, int locCode, int slotTypeId, int level, int capacity) {
        this.parkingLotCapacityId = parkingLotCapacityId;
        this.locCode=locCode;
        this.slotTypeId=slotTypeId;
        this.level=level;
        this.capacity=capacity;
    }

    public ParkingLotCapacityDao() {
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getParkingLotCapacityId() {
        return parkingLotCapacityId;
    }

    public void setParkingLotCapacityId(int parkingLotCapacityId) {
        this.parkingLotCapacityId = parkingLotCapacityId;
    }
}
