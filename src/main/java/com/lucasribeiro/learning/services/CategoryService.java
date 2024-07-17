package com.lucasribeiro.learning.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasribeiro.learning.abstracts.AbstractService;
import com.lucasribeiro.learning.entities.Category;
import com.lucasribeiro.learning.repositories.CategoryRepository;
import lombok.AccessLevel;

import lombok.Getter;

@Service
public class CategoryService extends AbstractService<Category, Long, CategoryRepository> {

	@Autowired
	@Getter(AccessLevel.PROTECTED)
	private CategoryRepository repository;

}
