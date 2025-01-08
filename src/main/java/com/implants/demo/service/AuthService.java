package com.implants.demo.service;

import com.implants.demo.model.User;
import com.implants.demo.repository.UserRepository;
import com.implants.demo.util.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTokenProvider tokenProvider;

    public String authenticateUser(String username, String password) {
        // Fetch the user from the database based on the username
        User user = userRepository.findByUsername(username);

        // Check if the user exists and the password is correct
        if (user != null && user.getPassword().equals(password)) {
            // If authentication is successful, generate and return the JWT token
            return tokenProvider.generateToken(user);
        } else {
            // Throw an exception if the user does not exist or password is incorrect
            throw new RuntimeException("Invalid username or password");
        }
    }
}
