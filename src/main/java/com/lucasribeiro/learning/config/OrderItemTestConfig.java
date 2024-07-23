package com.lucasribeiro.learning.config;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;
import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.entities.OrderItem;
import com.lucasribeiro.learning.entities.Product;
import com.lucasribeiro.learning.repositories.OrderItemRepository;
import com.lucasribeiro.learning.utils.ArrayUtils;

public class OrderItemTestConfig {
	
	public static void run(OrderItemRepository repository, List<Order> orders, List<Product> products) {
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		for(Integer index : ArrayUtils.elements(products.size())) {
			orderItems.add(getOrderItem(orders.get(index), products.get(index)));
		}
		repository.saveAll(orderItems);
	}
	
	private static OrderItem getOrderItem(Order order, Product product) {
		Faker faker = new Faker();
		return new OrderItem(order, product, faker.number().numberBetween(1, 5), product.getPrice());
	}
}
