package com.example.demo.controller;

import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/user")
    public Object userDetails() {
        return userRepository.getUser();
    }

}
