package com.sb.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.demo.model.User;
import com.sb.demo.repository.UserRepository;

@RestController
@RequestMapping("api/")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("users")
	public List<User> getUsers(){
		return userRepository.findAll();
		
	}

}
