package com.example.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.restapi.model.user;
import com.example.restapi.repository.UserRepository;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);

		
	}

	@Autowired 
	private UserRepository userRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new user("Mano","Dp","ManoDP@gmail.com"));
		this.userRepository.save(new user("nc","vwudi","vuwih@gmail.com"));
		this.userRepository.save(new user("hello","hai","hellohai@gmail.com"));
		
	}

}
