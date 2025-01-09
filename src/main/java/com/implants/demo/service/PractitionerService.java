package com.implants.demo.service;

import com.implants.demo.model.Practitioner;
import com.implants.demo.repository.PractitionerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PractitionerService {

    @Autowired
    private PractitionerRepository practitionerRepository;

    public List<Practitioner> getAllPractitioners() {
        return practitionerRepository.findAll();
    }

    public Optional<Practitioner> getPractitionerById(String id) {
        return practitionerRepository.findById(id);
    }

    public Practitioner savePractitioner(Practitioner practitioner) {
        return practitionerRepository.save(practitioner);
    }

    public void deletePractitionerById(String id) {
        practitionerRepository.deleteById(id);
    }
}
