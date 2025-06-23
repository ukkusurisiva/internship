package com.example.quizonline_web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizonline_web.dto.questiondto;
import com.example.quizonline_web.model.question;
import com.example.quizonline_web.service.questionservice;

@RestController
public class questioncontroller {

	@Autowired
	 questionservice q;
	@PostMapping("/questions")
	public questiondto postquestion(@RequestBody String pq)
	{
		return q.createquestion(pq);
	}
	@GetMapping("/retrivequestions")
	public List<question> getquestion()
	{
		return q.find();
		
	}
}
