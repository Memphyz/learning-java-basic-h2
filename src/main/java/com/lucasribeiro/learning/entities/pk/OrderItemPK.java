package com.lucasribeiro.learning.entities.pk;

import java.io.Serializable;

import com.lucasribeiro.learning.entities.Order;
import com.lucasribeiro.learning.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Embeddable
public @Data class OrderItemPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name ="order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

}
