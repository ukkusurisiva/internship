package com.example.quizonline_web.repositary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.quizonline_web.dto.questiondto;
import com.example.quizonline_web.model.question;

public interface questionrepo extends MongoRepository<question, String>
	{

	questiondto save(String pq);
		
	}
