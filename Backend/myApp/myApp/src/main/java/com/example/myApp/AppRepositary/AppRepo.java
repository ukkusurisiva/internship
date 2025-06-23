package com.example.myApp.AppRepositary;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.myApp.model.Login;
@Repository
public interface AppRepo extends MongoRepository<Login, String>
{
	
}