package com.implants.demo.repository;

import com.implants.demo.model.Practitioner;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PractitionerRepository extends MongoRepository<Practitioner, String> {
}

