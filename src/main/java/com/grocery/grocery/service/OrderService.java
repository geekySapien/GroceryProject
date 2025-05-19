package com.grocery.grocery.service;

import com.grocery.grocery.dto.OrderRequest;
import com.grocery.grocery.model.Customer;
import com.grocery.grocery.model.GroceryItem;
import com.grocery.grocery.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {

    @Autowired
    private GroceryService groceryService;


    @Autowired CustomerService customerService;

    Map<UUID, Order> map = new HashMap<>();

    public Order create(final OrderRequest orderRequest) {
        final UUID uuid = UUID.randomUUID();
        final Customer customer = customerService.get(orderRequest.getCustomerId());
        final List<GroceryItem> groceryItems = orderRequest.getGroceryItems()
                .stream()
                .map(id -> groceryService.get(id))
                .toList();

        final Double totalPrice = groceryItems
                .stream()
                .map(GroceryItem::getPrice)
                .reduce(0.0, Double::sum);
        final Order order = new Order(uuid, customer, groceryItems, totalPrice, new Date().toString());
        map.put(uuid, order);
        return order;

    }

    public Order get(final UUID uuid) {
        return map.get(uuid);
    }
}
