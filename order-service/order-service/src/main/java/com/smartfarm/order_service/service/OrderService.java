package com.smartfarm.order_service.service;

import com.smartfarm.order_service.model.Order;
import com.smartfarm.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order placeOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> getOrdersByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }
}