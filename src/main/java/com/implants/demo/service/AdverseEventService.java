package com.implants.demo.service;

import com.implants.demo.model.AdverseEvent;
import com.implants.demo.repository.AdverseEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdverseEventService {

    @Autowired
    private AdverseEventRepository adverseEventRepository;


    public AdverseEvent createAdverseEvent(AdverseEvent adverseEvent) {
        return adverseEventRepository.save(adverseEvent);
    }

    public AdverseEvent getAdverseEventById(String id) {
        return adverseEventRepository.findById(id).orElse(null); // Return null if not found
    }
}

