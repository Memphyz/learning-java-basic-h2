package com.lucasribeiro.learning.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasribeiro.learning.abstracts.AbstractResource;
import com.lucasribeiro.learning.entities.Category;
import com.lucasribeiro.learning.services.CategoryService;

import lombok.AccessLevel;
import lombok.Getter;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource extends AbstractResource<Category, Long, CategoryService> {

	@Autowired
	@Getter(AccessLevel.PROTECTED)
	private CategoryService service;

}
