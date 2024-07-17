package com.lucasribeiro.learning.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public abstract class AbstractResource<Entity, ID, Service extends AbstractService<Entity, ID, ? extends JpaRepository<Entity, ID>>> {
	
	protected abstract Service getService();
	
	@GetMapping
	public ResponseEntity<List<Entity>> findAll() {
		List<Entity> users = getService().findAll();
		return ResponseEntity.ok().body(users);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Entity> findById(@PathVariable ID id) {
		Entity entity = getService().findById(id);
		return ResponseEntity.ok().body(entity);
	}
}
