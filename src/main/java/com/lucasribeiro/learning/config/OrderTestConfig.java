package com.lucasribeiro.learning.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.entities.types.OrderStatusType;
import com.lucasribeiro.learning.utils.ArrayUtils;

public class OrderTestConfig {
	
	public static List<Order> run(List<User> users) {
		List<Order> orders = new ArrayList<Order>();
		for(Integer index : ArrayUtils.elements(5)) {
			User user = users.get(index);
			orders.add(getOrder(user));
		}
		return orders;
	}
	
	private static Order getOrder(User user) {
		return new Order(null, Instant.now(), OrderStatusType.WAITING_PAYMENT, user);
	}

}
