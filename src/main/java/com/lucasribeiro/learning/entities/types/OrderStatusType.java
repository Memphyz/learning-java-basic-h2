package com.lucasribeiro.learning.entities.types;

import lombok.Getter;

public enum OrderStatusType {
	
	WAITING_PAYMENT,
	PAID,
	SHIPPED,
	DELIVERED,
	CANCELED;
	
	@Getter
	private Integer status;
}
