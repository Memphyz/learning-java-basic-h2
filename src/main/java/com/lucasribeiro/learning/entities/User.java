package com.lucasribeiro.learning.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
}
