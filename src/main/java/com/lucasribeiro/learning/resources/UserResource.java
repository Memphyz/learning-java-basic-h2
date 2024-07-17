package com.lucasribeiro.learning.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasribeiro.learning.abstracts.AbstractResource;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource extends AbstractResource<User, Long, UserService> {

	public UserResource(UserService service) {
		super(service);
	}
	
}
