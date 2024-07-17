package com.lucasribeiro.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasribeiro.learning.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
