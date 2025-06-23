package com.example.quizonline_web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizonline_web.dto.questiondto;
import com.example.quizonline_web.model.question;
import com.example.quizonline_web.repositary.questionrepo;

@Service
public class questionservice {

	@Autowired
	questionrepo q;
	
	public questiondto createquestion(String pq)
	{
		return q.save(pq);
	}

	 public List<question> find(){
		 
		return q.findAll();
	
	 }
	
}
