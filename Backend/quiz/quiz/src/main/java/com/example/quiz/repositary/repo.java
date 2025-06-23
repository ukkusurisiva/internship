package com.example.quiz.repositary;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.quiz.model.login;

public interface repo extends MongoRepository<login, String> {
    @Query("{'email': ?0, 'password': ?1}")
    Optional<login> newpassword1(String email, String password);
    login findByemail(String s);
}