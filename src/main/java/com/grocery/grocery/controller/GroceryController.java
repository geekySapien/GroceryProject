package com.grocery.grocery.controller;

import com.grocery.grocery.dto.GroceryItemRequest;
import com.grocery.grocery.model.GroceryItem;
import com.grocery.grocery.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/grocery-items")
public class GroceryController {

    @Autowired
    private GroceryService groceryService;

    @PostMapping
    public ResponseEntity<GroceryItem> createItem(@RequestBody GroceryItemRequest groceryItemRequest) {
        return new ResponseEntity<>(groceryService.create(groceryItemRequest), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public GroceryItem getItem(@PathVariable("id") UUID uuid) {
        return groceryService.get(uuid);
    }


}
