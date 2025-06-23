package com.example.myApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myApp.dto.Logindto;
import com.example.myApp.model.Login;
import com.example.myApp.service.AppService;

@CrossOrigin(origins = {"http://192.168.137.53:3000"
						,"http://localhost:3000"})
 @RestController
public class  AppController
{
	 @Autowired
	 AppService as;

	/*@GetMapping("/hi")
	 public int test1(@RequestParam("nub1") int nub1,@RequestParam("nub2") int nub2)
	 {
		 return as.sum(nub1, nub2);
				 
	 }
	@GetMapping("/get2")
	public void test2(@RequestHeader("age") int age)
	{
		System.out.println(age);
		return ;
	}*/
	@PostMapping("/add")
	public int test3(@RequestBody Logindto ds)
	{
		 as.create2(ds);
		 return 1;
	}
	/*@PostMapping("/{hello}")
	public String test4(@PathVariable String hello)
	{
		return "My name is "+hello;
	}
	@PostMapping("/login")
	 public Login test4(@RequestBody Login ls)
	 {
		return as.create2(ls); 
	 }
	@PostMapping("/getlogin")
	public String test5(@RequestBody Logindto l){
		return as.find(l);
	}*/
	@GetMapping("/all")
	public List<Login> getall()
	{
		return as.findall();
	}
}