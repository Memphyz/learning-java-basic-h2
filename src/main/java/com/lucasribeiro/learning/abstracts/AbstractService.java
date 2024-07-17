package com.lucasribeiro.learning.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<Entity, ID, Repository extends JpaRepository<Entity, ID>> {
	
	protected abstract Repository getRepository();
	
	public List<Entity> findAll() {
		return getRepository().findAll();
	}
	
	public Entity findById(ID id) {
		Entity entity = getRepository().findById(id).get();
		return entity;
	}
	
}
