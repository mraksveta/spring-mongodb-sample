package com.github.mraksveta.mongodb.demo.service;

import com.github.mraksveta.mongodb.demo.document.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();

    Order findById(String id);

    Order save(Order order);

    void delete(Order order);

    void deleteById(String id);
}
