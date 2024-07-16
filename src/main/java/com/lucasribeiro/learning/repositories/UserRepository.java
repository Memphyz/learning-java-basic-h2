package com.lucasribeiro.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasribeiro.learning.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
