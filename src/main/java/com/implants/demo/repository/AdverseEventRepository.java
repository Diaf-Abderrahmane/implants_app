package com.implants.demo.repository;

import com.implants.demo.model.AdverseEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdverseEventRepository extends MongoRepository<AdverseEvent, String> {
    // Custom queries if needed
}