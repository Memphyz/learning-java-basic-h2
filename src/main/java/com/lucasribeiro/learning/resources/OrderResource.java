package com.lucasribeiro.learning.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasribeiro.learning.abstracts.AbstractResource;
import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource extends AbstractResource<Order, Long, OrderService> {

	public OrderResource(OrderService service) {
		super(service);
	}
	
}