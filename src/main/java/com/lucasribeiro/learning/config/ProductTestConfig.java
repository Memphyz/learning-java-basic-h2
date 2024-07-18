package com.lucasribeiro.learning.config;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;
import com.lucasribeiro.learning.entities.Category;
import com.lucasribeiro.learning.entities.Product;
import com.lucasribeiro.learning.repositories.ProductRepository;
import com.lucasribeiro.learning.utils.ArrayUtils;

public class ProductTestConfig {
	

	public static void run(ProductRepository repository, List<Category> categories) {
		List<Product> products = new ArrayList<Product>();
		ArrayUtils.loop(100, (i) -> {
			products.add(getProduct(categories));
		});
		repository.saveAll(products);
	}
	
	private static Product getProduct(List<Category> categories) {
		Faker faker = new Faker();
		Random random = new Random();
		Product produto = new Product(null, faker.commerce().productName(), faker.leagueOfLegends().quote(), new BigDecimal(0), null, new HashSet<Category>());
		produto.getCategories().add(categories.get(random.nextInt(categories.size())));
		return produto;
	}
	
	

}
