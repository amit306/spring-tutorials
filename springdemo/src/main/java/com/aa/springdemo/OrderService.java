package com.aa.springdemo;

import com.aa.springdemo.entity.Order;
import com.aa.springdemo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    List<Order> getAllOrders(){
       return orderRepository.findAll();
    }
}
