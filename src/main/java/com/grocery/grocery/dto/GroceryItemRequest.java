package com.grocery.grocery.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GroceryItemRequest {
    private String name;
    private String category;
    private int quantity;
    private Double price;
}
