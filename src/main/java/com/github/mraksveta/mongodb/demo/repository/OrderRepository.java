package com.github.mraksveta.mongodb.demo.repository;

import com.github.mraksveta.mongodb.demo.document.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
