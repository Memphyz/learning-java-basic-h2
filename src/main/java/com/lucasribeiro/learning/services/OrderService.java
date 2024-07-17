package com.lucasribeiro.learning.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasribeiro.learning.abstracts.AbstractService;
import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.repositories.OrderRepository;
import lombok.AccessLevel;

import lombok.Getter;

@Service
public class OrderService extends AbstractService<Order, Long, OrderRepository> {
	
	@Autowired
	@Getter(AccessLevel.PROTECTED)
	private OrderRepository repository;
	
}
