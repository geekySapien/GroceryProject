package com.grocery.grocery.service;

import com.grocery.grocery.dto.CustomerRequest;
import com.grocery.grocery.model.Customer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class CustomerService {

    public Map<UUID, Customer> map = new HashMap<>();

    public Customer create(final CustomerRequest customerRequest) {
        final UUID uuid = UUID.randomUUID();
        final Customer customerCreated = new Customer(uuid, customerRequest.getName(), customerRequest.getEmail(), customerRequest.getAddress(), customerRequest.getEmail());
        map.put(uuid, customerCreated);
        return customerCreated;

    }

    public Customer get(final UUID uuid) {
        return map.get(uuid);
    }
}
