package com.lucasribeiro.learning.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasribeiro.learning.abstracts.AbstractService;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.repositories.UserRepository;

import lombok.AccessLevel;
import lombok.Getter;

@Service
public class UserService extends AbstractService<User, Long, UserRepository> {
	
	@Autowired
	@Getter(AccessLevel.PROTECTED)
	private UserRepository repository;
	
}
