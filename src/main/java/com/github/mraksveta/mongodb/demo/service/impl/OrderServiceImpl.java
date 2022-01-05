package com.github.mraksveta.mongodb.demo.service.impl;

import com.github.mraksveta.mongodb.demo.document.Order;
import com.github.mraksveta.mongodb.demo.exception.OrderNotFoundException;
import com.github.mraksveta.mongodb.demo.repository.OrderRepository;
import com.github.mraksveta.mongodb.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(String id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.orElseThrow(() -> new OrderNotFoundException(String.format("No order found for id '%s'", id)));
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void delete(Order order) {
        orderRepository.delete(order);
    }

    @Override
    public void deleteById(String id) {
        orderRepository.deleteById(id);
    }
}
