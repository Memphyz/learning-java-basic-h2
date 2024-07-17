package com.lucasribeiro.learning.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasribeiro.learning.abstracts.AbstractResource;
import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.services.OrderService;

import lombok.AccessLevel;
import lombok.Getter;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource extends AbstractResource<Order, Long, OrderService> {

	@Autowired
	@Getter(AccessLevel.PROTECTED)
	private OrderService service;
	
}