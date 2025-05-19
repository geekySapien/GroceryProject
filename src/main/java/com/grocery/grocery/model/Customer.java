package com.grocery.grocery.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private UUID id;

    private String name;
    private String email;
    private String address;
    private String phone;
}
