package com.lucasribeiro.learning.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lucasribeiro.learning.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="tb_order_item")
public @Data class OrderItem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	private Integer quantity;
	private BigDecimal price;
	
	public OrderItem(Order order, Product product,Integer quantity, BigDecimal price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	
	@JsonIgnore
		return id.getOrder();
	}
	
	
}
