package com.dbmsproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitializationService {
    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private SlotTypeRepository slotTypeRepository;

    @Autowired
    private FaresRepository faresRepository;
    
}
