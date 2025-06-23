package com.example.quizonline_web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizonline_web.model.user;
import com.example.quizonline_web.repositary.userrepo;
 
@Service
public class userservice
{
	@Autowired
	userrepo ur;

	public user createuser(user l) {
		
		return ur.save(l);
	}
	public List<user> find() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

}