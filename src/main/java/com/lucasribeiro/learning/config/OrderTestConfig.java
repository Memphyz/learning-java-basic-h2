package com.lucasribeiro.learning.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.entities.types.OrderStatusType;
import com.lucasribeiro.learning.repositories.OrderRepository;
import com.lucasribeiro.learning.repositories.UserRepository;
import com.lucasribeiro.learning.utils.ArrayUtils;

@Configuration
@Profile("test")
public class OrderTestConfig implements CommandLineRunner{
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		List<Order> orders = new ArrayList<Order>();
		List<User> users = userRepository.findAll();
		Random random = new Random();
		ArrayUtils.loop(3, (i) -> {
			User user = users.get(random.nextInt(users.size()));
			orders.add(getOrder(user));
		});
		repository.saveAll(orders);
	}
	
	private static Order getOrder(User user) {
		return new Order(null, Instant.now(), user, OrderStatusType.WAITING_PAYMENT);
	}

}
