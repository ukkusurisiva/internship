package com.example.quizonline_web.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizonline_web.model.user;
import com.example.quizonline_web.service.userservice;


@RestController
public class usercontrol
{
	@Autowired
	userservice us;
	  
	@PostMapping("/createuser")
	public String create(@RequestBody user l)
	{
		us.createuser(l);
		return "created";
	}
	@GetMapping("/getuser")
	public List<user> getuser()
	{
		return us.find();
	}
	
	
}