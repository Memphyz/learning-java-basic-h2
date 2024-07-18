package com.lucasribeiro.learning.config;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;
import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.repositories.UserRepository;
import com.lucasribeiro.learning.utils.ArrayUtils;
import com.lucasribeiro.learning.entities.User;

public class UserTestConfig {

	public static List<User> run(UserRepository repository) {
		List<User> users = new ArrayList<User>();
		ArrayUtils.loop(100, (i) -> users.add(getUser()));
		repository.saveAll(users);
		return users;
	}
	
	private static User getUser() {
		Faker faker = new Faker();
		return new User(null, faker.name().fullName(), faker.internet().emailAddress(), faker.phoneNumber().cellPhone(),
				faker.internet().password(), new ArrayList<Order>());
	}

}
