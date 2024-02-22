package com.dbmsproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.dao.BookSlotDao;
import com.dbmsproject.models.BookSlot;
import com.dbmsproject.repositories.BookSlotRepository;
import com.dbmsproject.repositories.ParkingLotCapacityRepository;

@Service
public class BookSlotService {
    @Autowired
    private BookSlotRepository bookedSlotRepository;

    @Autowired
    private ParkingLotCapacityRepository parkingLotCapacityRepository;

    public boolean bookSlot(BookSlot bookSlot){
        if (!slotAvailable(bookSlot)) return false;

        bookedSlotRepository.save(new BookSlotDao(bookSlot.getLocCode(),bookSlot.getSlotTypeId(), bookSlot.getPhone()));
        return true;
    }

    public boolean slotAvailable(BookSlot bookSlot){
        int totalCapacity = parkingLotCapacityRepository.getTotalCapacity(bookSlot.getLocCode(), bookSlot.getSlotTypeId());
        int numberOfslotsBooked = bookedSlotRepository.getNumberOfBookedSlots(bookSlot.getLocCode(), bookSlot.getSlotTypeId());
        return totalCapacity - numberOfslotsBooked > 0;
    }
}
