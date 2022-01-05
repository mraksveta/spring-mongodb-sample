package com.github.mraksveta.mongodb.demo.controller;

import com.github.mraksveta.mongodb.demo.document.Order;
import com.github.mraksveta.mongodb.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }

    @GetMapping("/{orderId}")
    public Order getOrder(@PathVariable("orderId") String orderId) {
        return orderService.findById(orderId);
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        order.setId(null);
        order.setOffsetDateTime(LocalDateTime.now());
        return orderService.save(order);
    }

    @PutMapping("/{orderId}")
    public Order updateOrder(@RequestBody Order order,
                             @PathVariable("orderId") String orderId) {
        order.setId(orderId);
        return orderService.save(order);
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<Void> deleteOrder(@PathVariable("orderId") String orderId) {
        orderService.deleteById(orderId);
        return ResponseEntity.ok().build();
    }
}
