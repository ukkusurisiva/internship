package com.example.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz.model.login;
import com.example.quiz.repositary.repo;

@Service
public class service1
{
	@Autowired
	repo r;
	
	
	public String add(login l)
	{
		r.save(l);
		return "correct";
	}
	public List<login> find() {
		// TODO Auto-generated method stub
		return r.findAll();
	}
	public String updatepassword(String email, String password, String newpassword) {
	    Optional<login> pl = r.newpassword1(email, password);
	    if (pl.isPresent()) {
	        login lg = pl.get();
	        lg.setPassword(newpassword);
	        r.save(lg);  // Save updated password
	        return "Password updated successfully"
	    } else {
	        return "Email or password invalid";
	    }
	}
	public boolean check(String s) {
		
		login m=r.findByemail(s);
		return m!=null;
	}
}
	