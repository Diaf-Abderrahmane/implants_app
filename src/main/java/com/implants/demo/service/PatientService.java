package com.implants.demo.service;

import com.implants.demo.model.Patient;
import com.implants.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Method to get a single patient by id
    public Patient getPatientById(String id) {
        Optional<Patient> patient = patientRepository.findById(id);

        // Return the patient if found, else return null
        return patient.orElse(null);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();  // Retrieves all patients from the MongoDB database
    }
}
