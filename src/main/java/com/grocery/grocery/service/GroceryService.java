package com.grocery.grocery.service;


import com.grocery.grocery.dto.GroceryItemRequest;
import com.grocery.grocery.model.GroceryItem;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class GroceryService {

    public Map<UUID, GroceryItem> map = new HashMap<>();

    public GroceryItem create(final GroceryItemRequest groceryRequest) {
        final UUID uuid = UUID.randomUUID();
        final GroceryItem groceryItem = new GroceryItem(uuid, groceryRequest.getName(), groceryRequest.getCategory(), groceryRequest.getQuantity(), groceryRequest.getPrice());
        map.put(uuid, groceryItem);
        return groceryItem;

    }

    public GroceryItem get(final UUID uuid) {
        return map.get(uuid);
    }
}
