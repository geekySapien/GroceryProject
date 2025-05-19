package com.grocery.grocery.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private UUID id;
    private Customer customer;
    private List<GroceryItem> items;
    private Double totalPrice;
    private String date;
}
