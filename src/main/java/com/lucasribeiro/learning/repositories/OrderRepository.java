package com.lucasribeiro.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasribeiro.learning.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
