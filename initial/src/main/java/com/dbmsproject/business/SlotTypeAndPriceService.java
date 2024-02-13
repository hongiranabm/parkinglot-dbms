package com.dbmsproject.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.dao.FaresDao;
import com.dbmsproject.dao.LocationDao;
import com.dbmsproject.dao.SlotTypeDao;
import com.dbmsproject.models.SlotTypeAndPrice;
import com.dbmsproject.repositories.FaresRepository;
import com.dbmsproject.repositories.SlotTypeRepository;

@Service
public class SlotTypeAndPriceService {

    @Autowired
    private SlotTypeRepository slotTypeRepository;
    private FaresRepository faresRepository;
    
    public List<SlotTypeAndPrice> getParkingLots() {
        List<SlotTypeAndPrice> slotTypeAndPrices = new ArrayList<>();
        Iterator<SlotTypeAndPrice> iterator1 = slotTypeRepository.findAll().iterator();
        Iterator<FaresRepository> iterator2 = faresRepository.findAll().iterator();

        while(iterator1.hasNext()){
            while(iterator2.hasNext()){
                if(iterator1.slotTypeId == iterator2.slotTypeId)
            }
            slotTypeAndPrices.add(convertToPojo(iterator1.next(),));
        }
        return slotTypeAndPrices;
    }

    private SlotTypeAndPrice convertToPojo(SlotTypeDao slotTypeDao, FaresDao faresDao){
        return new SlotTypeAndPrice(slotTypeDao.getSlotTypeId(), slotTypeDao.getVehType(), faresDao.getFaresId());
    }
}
