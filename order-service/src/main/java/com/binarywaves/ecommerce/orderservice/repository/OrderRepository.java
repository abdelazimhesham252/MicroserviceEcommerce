package com.binarywaves.ecommerce.orderservice.repository;

import com.binarywaves.ecommerce.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
