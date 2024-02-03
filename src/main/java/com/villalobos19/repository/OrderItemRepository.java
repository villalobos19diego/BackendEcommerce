package com.villalobos19.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.villalobos19.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
