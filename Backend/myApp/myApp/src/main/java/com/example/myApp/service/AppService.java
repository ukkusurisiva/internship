package com.example.myApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myApp.AppRepositary.AppRepo;
import com.example.myApp.dto.Logindto;
import com.example.myApp.model.Login;

@Service
 public class AppService
 {
	@Autowired
	AppRepo ar;
	public List<Login> findall()
	{
		return ar.findAll();
	}
	public int sum(int a,int b)
	{
		return a+b;
	}
	public Login create2(Logindto ls)
	{
		Login l=new Login();
		l.setUsername(ls.getUsername());
		l.setPassword(ls.getPassword());
		return ar.save(l);
	}
	public String find(Logindto l)
	{
      Login p=new Login();
      p=ar.findById(l.getUsername()).orElse(null);
      if(p==null)
    	  return "not valid";
      else if(l.getPassword().equals(p.getPassword()))
    	  return "valid user";
      else
    	  return "password invalid";
	}
 }