package com.example.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz.model.dto;
import com.example.quiz.model.login;
import com.example.quiz.service.service1;
@CrossOrigin("*")
@RestController
public class TaskController
{
	@Autowired 
	service1 as;
	@PostMapping("/add")
	public String add(@RequestBody login l)
	{
		as.add(l);
		return "correct";
	}
	@GetMapping("/all")
	public List<login> all()
	{
		return as.find();
		
	}
	@GetMapping("/check")
	public boolean check(@RequestParam("email") String s)
	{
		return as.check(s);
	}
	@PutMapping("/update")
	public String update(@RequestBody dto dt)
	{
		return as.updatepassword(dt.getEmail(),dt.getPassword(),dt.getNewpassword());
	}
}