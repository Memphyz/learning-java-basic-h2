package com.lucasribeiro.learning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		User user = repository.findById(id).get();
		return user;
	}
}
