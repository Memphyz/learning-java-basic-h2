package com.lucasribeiro.learning.config;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;
import com.lucasribeiro.learning.entities.Category;
import com.lucasribeiro.learning.entities.Product;
import com.lucasribeiro.learning.utils.ArrayUtils;

public class ProductTestConfig {
	

	public static List<Product> run(List<Category> categories) {
		List<Product> products = new ArrayList<Product>();
		for(Integer index : ArrayUtils.elements(5)) {
			products.add(getProduct(categories.get(index)));
		}
		return products;
	}
	
	private static Product getProduct(Category category) {
		Faker faker = new Faker();
		Product produto = new Product(null, faker.commerce().productName(), faker.leagueOfLegends().quote(), new BigDecimal(faker.number().numberBetween(1, 100)), null);
		produto.getCategories().add(category);
		return produto;
	}
	
	

}
