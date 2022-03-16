package com.example.demo.repository;

import com.example.demo.domain.User;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


/**
 * UserRepository contains the necessary logic to interact with Aurora (Postgres) DB User Table
 */

@Slf4j
@Repository
@AllArgsConstructor
@NoArgsConstructor
public class UserRepository {

    @Value("${appuser.name}")
    private String username;

    private Logger logger = LoggerFactory.getLogger(UserRepository.class);
    public User getUser() {

        User user =
                User.builder()
                        .id(1)
                        .google_id("123456789")
                        .first_name("Rohit")
                        .last_name("Anand")
                        .email(username+"@gmail.com")
                        .build();
        return user;
    };
}
