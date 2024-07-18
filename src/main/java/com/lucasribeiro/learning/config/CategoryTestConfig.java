package com.lucasribeiro.learning.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.github.javafaker.Faker;
import com.lucasribeiro.learning.entities.Category;
import com.lucasribeiro.learning.entities.Product;
import com.lucasribeiro.learning.repositories.CategoryRepository;
import com.lucasribeiro.learning.utils.ArrayUtils;

public class CategoryTestConfig {
	

	public static List<Category> run(CategoryRepository repository) {
		List<Category> categories = new ArrayList<Category>();
		Set<Product> selectedProducts = new HashSet<Product>();
		ArrayUtils.loop(100, (i) -> {
			Category category = getCategory(selectedProducts);
			categories.add(category);
		});
		repository.saveAll(categories);
		return categories;
	}
	
	private static Category getCategory(Set<Product> products) {
		Faker faker = new Faker();
		return new Category(null, faker.cat().breed(), products);
	}
}
