package com.lucasribeiro.learning.entities.types;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum OrderStatusType {
	
	WAITING_PAYMENT("WAITING_PAYMENT"),
	PAID("PAID"),
	SHIPPED("SHIPPED"),
	DELIVERED("DELIVERED"),
	CANCELED("CANCELED");
	
	@Getter
	private String status;
}
