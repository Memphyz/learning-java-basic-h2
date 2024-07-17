package com.lucasribeiro.learning.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasribeiro.learning.abstracts.AbstractService;
import com.lucasribeiro.learning.entities.Product;
import com.lucasribeiro.learning.repositories.ProductRepository;

import lombok.AccessLevel;
import lombok.Getter;

@Service
public class ProductService extends AbstractService<Product, Long, ProductRepository> {
	
	@Autowired
	@Getter(AccessLevel.PROTECTED)
	private ProductRepository repository;
}
