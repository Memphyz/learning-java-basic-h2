package com.lucasribeiro.learning.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucasribeiro.learning.entities.Category;
import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.entities.OrderItem;
import com.lucasribeiro.learning.entities.Product;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.repositories.CategoryRepository;
import com.lucasribeiro.learning.repositories.OrderItemRepository;
import com.lucasribeiro.learning.repositories.OrderRepository;
import com.lucasribeiro.learning.repositories.ProductRepository;
import com.lucasribeiro.learning.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig {

	public TestConfig(UserRepository userRepository,
			OrderRepository orderRepository,
			CategoryRepository categoryRepository,
			ProductRepository productRepository,
			OrderItemRepository orderItemRepository
			) {
		List<User> users = UserTestConfig.run();
		List<Order> orders = OrderTestConfig.run(users);
		List<Category> categories = CategoryTestConfig.run();
		List<Product> products = ProductTestConfig.run(categories);
		List<OrderItem> orderItems =OrderItemTestConfig.run(orders, products);
		users = userRepository.saveAll(users);
		categories = categoryRepository.saveAll(categories);
		products = productRepository.saveAll(products);
		orders= orderRepository.saveAll(orders);
		orderItems= orderItemRepository.saveAll(orderItems);
	}

}
