package com.dbmsproject.business;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.dao.FaresDao;
import com.dbmsproject.models.SlotTypeAndPrice;
import com.dbmsproject.repositories.FaresRepository;

@Service
public class SlotTypeAndPriceService {

    @Autowired
    private FaresRepository faresRepository;
    
    public ArrayList<SlotTypeAndPrice> getSlotTypesAndPrices(int locCode) {
        ArrayList<SlotTypeAndPrice> slotTypeAndPrices = new ArrayList<>();
        Iterator<FaresDao> iterator = faresRepository.findBylocCode(locCode).iterator();

        while(iterator.hasNext()){
            slotTypeAndPrices.add(convertToPojo(iterator.next()));
        }
        return slotTypeAndPrices;
    }

    public SlotTypeAndPrice getSlotTypesAndPrices(int locCode, int vehType){
        return getSlotTypesAndPrices(locCode).stream().filter(s -> s.getVehType() == vehType).findFirst().orElse(null);
    }

    private SlotTypeAndPrice convertToPojo(FaresDao faresDao){
        return new SlotTypeAndPrice(faresDao.getSlotType().getSlotTypeId(), faresDao.getSlotType().getVehType(), faresDao.getAmount(), faresDao.getLoc().getLocCode());
    }
}
