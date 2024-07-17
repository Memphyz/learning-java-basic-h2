package com.lucasribeiro.learning.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.github.javafaker.Faker;
import com.lucasribeiro.learning.entities.Category;
import com.lucasribeiro.learning.entities.Product;
import com.lucasribeiro.learning.repositories.CategoryRepository;
import com.lucasribeiro.learning.utils.ArrayUtils;

@Configuration
@Profile("test")
public class CategoryTestConfig implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository repository;
	
//	@Autowired
//	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		List<Category> categories = new ArrayList<Category>();
		Set<Product> selectedProducts = new HashSet<Product>();
//		List<Product> products = productRepository.findAll();
//		Random random = new Random();
//		ArrayUtils.loop(10, (i) -> {
//			selectedProducts.add(products.get(random.nextInt(products.size())));
//		});
		ArrayUtils.loop(100, (i) -> {
			Category category = getCategory(selectedProducts);
			categories.add(category);
		});
		repository.saveAll(categories);
	}
	
	private static Category getCategory(Set<Product> products) {
		Faker faker = new Faker();
		return new Category(null, faker.cat().breed(), products);
	}
}
