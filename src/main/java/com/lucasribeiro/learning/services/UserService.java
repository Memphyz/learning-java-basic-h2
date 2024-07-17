package com.lucasribeiro.learning.services;

import org.springframework.stereotype.Service;

import com.lucasribeiro.learning.AbstractService;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.repositories.UserRepository;

@Service
public class UserService extends AbstractService<User, Long, UserRepository> {
	
	public UserService(UserRepository repository) {
		super(repository);
	}
	
}
