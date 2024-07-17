package com.lucasribeiro.learning.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public abstract class AbstractResource<Entity, ID, Service extends AbstractService<Entity, ID, ? extends JpaRepository<Entity, ID>>> {
	
	protected final Service service;
	
	public AbstractResource(Service service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Entity>> findAll() {
		List<Entity> users = service.findAll();
		return ResponseEntity.ok().body(users);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Entity> findById(@PathVariable ID id) {
		Entity entity = service.findById(id);
		return ResponseEntity.ok().body(entity);
	}
}
