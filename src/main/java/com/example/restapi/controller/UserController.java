package com.example.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.model.user;
import com.example.restapi.repository.UserRepository;

@RestController
@RequestMapping("api/")
public class UserController {


	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("user")
	public List<user> getusers(){
		
		return this.userRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<user> getuser(@PathVariable (value="id") long userid){
		return this.userRepository.findById(userid);
	}

	//Create
	@PostMapping     
	public user postuser(@RequestBody user user) {
		return this.userRepository.save(user);
	}
	
	@DeleteMapping("/delete")
	public user deleteuser() {
		return this.deleteuser();
	}
	
	
}
