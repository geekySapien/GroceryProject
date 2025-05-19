package com.grocery.grocery.controller;

import com.grocery.grocery.dto.OrderRequest;
import com.grocery.grocery.model.Order;
import com.grocery.grocery.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.create(orderRequest);
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable("id") UUID uuid) {
        return orderService.get(uuid);
    }
}
