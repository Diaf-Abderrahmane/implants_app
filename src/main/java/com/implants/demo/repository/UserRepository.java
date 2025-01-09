package com.implants.demo.repository;

import com.implants.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // Change return type to Optional for better null handling
    User findByUsername(String username);
}
