package com.lucasribeiro.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasribeiro.learning.entities.OrderItem;
import com.lucasribeiro.learning.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
