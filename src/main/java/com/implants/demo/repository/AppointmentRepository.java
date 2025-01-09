package com.implants.demo.repository;

import com.implants.demo.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {
    // Additional query methods can be added here if needed
}
