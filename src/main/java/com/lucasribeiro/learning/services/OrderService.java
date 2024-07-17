package com.lucasribeiro.learning.services;

import org.springframework.stereotype.Service;

import com.lucasribeiro.learning.abstracts.AbstractService;
import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.repositories.OrderRepository;

@Service
public class OrderService extends AbstractService<Order, Long, OrderRepository> {
	
	public OrderService(OrderRepository repository) {
		super(repository);
	}
	
}
