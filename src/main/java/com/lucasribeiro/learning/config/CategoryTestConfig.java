package com.lucasribeiro.learning.config;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;
import com.lucasribeiro.learning.entities.Category;
import com.lucasribeiro.learning.utils.ArrayUtils;

public class CategoryTestConfig {
	

	public static List<Category> run() {
		List<Category> categories = new ArrayList<Category>();
		ArrayUtils.loop(5, (i) -> {
			Category category = getCategory();
			categories.add(category);
		});
		return categories;
	}
	
	private static Category getCategory() {
		Faker faker = new Faker();
		return new Category(null, faker.cat().breed());
	}
}
