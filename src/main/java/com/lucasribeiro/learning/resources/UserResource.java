package com.lucasribeiro.learning.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasribeiro.learning.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User user = new User(1L, "Maria", "teste@gmail,com", "11999999999", "1234");
		return ResponseEntity.ok().body(user);
	}
}
