package com.lucasribeiro.learning.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.github.javafaker.Faker;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		Faker faker = new Faker();
		ArrayList<User> users = new ArrayList<User>();
		int els = 0;
		do {
			users.add(new User(
					faker.number().randomNumber(),
					faker.name().fullName(),
					faker.internet().emailAddress(),
					faker.phoneNumber().cellPhone(),
					faker.internet().password()));
			++els;
		} while (els <= 100);
		userRepository.saveAll(users);
	}
	
	
}
