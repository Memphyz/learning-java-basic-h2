package com.lucasribeiro.learning.config;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.github.javafaker.Faker;
import com.lucasribeiro.learning.entities.Category;
import com.lucasribeiro.learning.entities.Product;
import com.lucasribeiro.learning.repositories.ProductRepository;
import com.lucasribeiro.learning.utils.ArrayUtils;

@Configuration
@Profile("test")
public class ProductTestConfig implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repository;

	@Override
	public void run(String... args) throws Exception {
		List<Product> products = new ArrayList<Product>();
		ArrayUtils.loop(3, (i) -> {
			products.add(getProduct());
		});
		repository.saveAll(products);
	}
	
	private static Product getProduct() {
		Faker faker = new Faker();
		return new Product(null, faker.commerce().productName(), faker.leagueOfLegends().quote(), new BigDecimal(0), null, new HashSet<Category>());
	}
	
	

}
