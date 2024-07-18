package com.lucasribeiro.learning.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.entities.types.OrderStatusType;
import com.lucasribeiro.learning.repositories.OrderRepository;
import com.lucasribeiro.learning.utils.ArrayUtils;

public class OrderTestConfig {
	
	public static void run(OrderRepository repository,List<User> users) {
		List<Order> orders = new ArrayList<Order>();
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
