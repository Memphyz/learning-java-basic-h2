package com.lucasribeiro.learning.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucasribeiro.learning.entities.Category;
import com.lucasribeiro.learning.entities.User;
import com.lucasribeiro.learning.repositories.CategoryRepository;
import com.lucasribeiro.learning.repositories.OrderRepository;
import com.lucasribeiro.learning.repositories.ProductRepository;
import com.lucasribeiro.learning.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig {

	public TestConfig(UserRepository userRepository, OrderRepository orderRepository, CategoryRepository categoryRepository, ProductRepository productRepository) {
		List<User> users = UserTestConfig.run(userRepository);
		OrderTestConfig.run(orderRepository, users);
		List<Category> categories = CategoryTestConfig.run(categoryRepository);
		ProductTestConfig.run(productRepository, categories);
	}

}
