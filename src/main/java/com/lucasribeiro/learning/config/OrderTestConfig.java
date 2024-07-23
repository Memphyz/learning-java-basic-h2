package com.lucasribeiro.learning.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.entities.OrderItem;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.entities.types.OrderStatusType;
import com.lucasribeiro.learning.repositories.OrderRepository;
import com.lucasribeiro.learning.utils.ArrayUtils;

public class OrderTestConfig {
	
	public static List<Order> run(OrderRepository repository,List<User> users) {
		List<Order> orders = new ArrayList<Order>();
		for(Integer index : ArrayUtils.elements(5)) {
			User user = users.get(index);
			orders.add(getOrder(user));
		}
		repository.saveAll(orders);
		return orders;
	}
	
	private static Order getOrder(User user) {
		return new Order(null, Instant.now(), user, OrderStatusType.WAITING_PAYMENT, (Set<OrderItem>) new HashSet<OrderItem>());
	}

}
