package com.lucasribeiro.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasribeiro.learning.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
