package com.grocery.grocery.controller;

import com.grocery.grocery.dto.CustomerRequest;
import com.grocery.grocery.model.Customer;
import com.grocery.grocery.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody CustomerRequest customerRequest) {
        return new ResponseEntity<>(customerService.create(customerRequest), HttpStatus.CREATED);
    }

    @RequestMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") UUID id) {
        return customerService.get(id);
    }
}
