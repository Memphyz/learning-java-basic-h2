package com.lucasribeiro.learning.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasribeiro.learning.abstracts.AbstractResource;
import com.lucasribeiro.learning.entities.Product;
import com.lucasribeiro.learning.services.ProductService;

import lombok.AccessLevel;
import lombok.Getter;

@RestController
@RequestMapping(value ="/products")
public class ProductResource extends AbstractResource<Product, Long, ProductService> {

	@Autowired
	@Getter(AccessLevel.PROTECTED)
	private ProductService service;
}
