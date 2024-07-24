package com.lucasribeiro.learning.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lucasribeiro.learning.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_order_item")
public @Data class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	@Getter(AccessLevel.NONE)
	private final OrderItemPK id = new OrderItemPK();
	private Integer quantity;
	private BigDecimal price;

	public OrderItem(Order order, Product product, Integer quantity, BigDecimal price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}

	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}

	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Product product) {
		id.setProduct(product);
	}

	public BigDecimal getSubTotal() {
		return price.multiply(new BigDecimal(quantity));
	}

}
