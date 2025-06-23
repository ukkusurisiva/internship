package com.example.quizonline_web.repositary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.quizonline_web.model.user;

public interface userrepo extends MongoRepository<user, String>
{
	
}