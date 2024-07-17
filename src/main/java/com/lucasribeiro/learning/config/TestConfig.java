package com.lucasribeiro.learning.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.github.javafaker.Faker;
import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.repositories.OrderRepository;
import com.lucasribeiro.learning.repositories.UserRepository;
import com.lucasribeiro.learning.utils.ArrayUtils;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		Faker faker = new Faker();
		ArrayList<User> users = runUsersTest(faker);
		runOrdersTest(faker, users);
	}

	private void runOrdersTest(Faker faker, ArrayList<User> users) {
		ArrayList<Order> orders = new ArrayList<Order>();
		Random random = new Random();
		ArrayUtils.loop(3, (i) -> {
			User user = users.get(random.nextInt(users.size()));
			orders.add(getOrder(faker, user));
		});
		orderRepository.saveAll(orders);
	}

	private Order getOrder(Faker faker, User user) {
		return new Order(null, Instant.now(), user);
	}

	private ArrayList<User> runUsersTest(Faker faker) {
		ArrayList<User> users = new ArrayList<User>();
		ArrayUtils.loop(100, (i) -> users.add(getUser(faker)));
		userRepository.saveAll(users);
		return users;
	}

	private User getUser(Faker faker) {
		return new User(null, faker.name().fullName(), faker.internet().emailAddress(), faker.phoneNumber().cellPhone(),
				faker.internet().password(), new ArrayList<Order>());
	}

}
