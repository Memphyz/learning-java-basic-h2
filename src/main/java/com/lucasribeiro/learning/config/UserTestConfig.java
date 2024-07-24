package com.lucasribeiro.learning.config;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.utils.ArrayUtils;

public class UserTestConfig {

	public static List<User> run() {	
		List<User> users = new ArrayList<User>();
		ArrayUtils.loop(5, (i) -> users.add(getUser()));
		return users;
	}
	
	private static User getUser() {
		Faker faker = new Faker();
		return new User(null, faker.name().fullName(), faker.internet().emailAddress(), faker.phoneNumber().cellPhone(),
				faker.internet().password());
	}

}
