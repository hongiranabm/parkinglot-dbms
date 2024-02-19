package com.dbmsproject.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.dao.FaresDao;
import com.dbmsproject.models.SlotTypeAndPrice;
import com.dbmsproject.repositories.FaresRepository;

@Service
public class SlotTypeAndPriceService {

    @Autowired
    private FaresRepository faresRepository;
    
    public List<SlotTypeAndPrice> getSlotTypesAndPrices(int locCode) {
        List<SlotTypeAndPrice> slotTypeAndPrices = new ArrayList<>();
        Iterator<FaresDao> iterator = faresRepository.findBylocCode(locCode).iterator();

        while(iterator.hasNext()){
            slotTypeAndPrices.add(convertToPojo(iterator.next()));
        }
        return slotTypeAndPrices;
    }

    private SlotTypeAndPrice convertToPojo(FaresDao faresDao){
        return new SlotTypeAndPrice(faresDao.getSlotType().getSlotTypeId(), faresDao.getFaresId(), faresDao.getLoc().getLocCode());
    }
}
