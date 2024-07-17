package com.lucasribeiro.learning.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<Entity, ID, Repository extends JpaRepository<Entity, ID>> {
	
	protected final Repository repository;
	
	public AbstractService(Repository repository) {
		this.repository = repository;
	}
	
	public List<Entity> findAll() {
		return repository.findAll();
	}
	
	public Entity findById(ID id) {
		Entity entity = repository.findById(id).get();
		return entity;
	}
	
}
