package com.grocery.grocery.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter

@NoArgsConstructor
public class OrderRequest {

    private UUID customerId;
    private List<UUID> groceryItems;
}
