package com.lucasribeiro.learning.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasribeiro.learning.abstracts.AbstractResource;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.services.UserService;

import lombok.AccessLevel;
import lombok.Getter;

@RestController
@RequestMapping(value = "/users")
public class UserResource extends AbstractResource<User, Long, UserService> {

	@Autowired
	@Getter(AccessLevel.PROTECTED)
	private UserService service;
	
}
