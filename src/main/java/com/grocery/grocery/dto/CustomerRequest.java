package com.grocery.grocery.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerRequest {
    private String name;
    private String email;
    private String address;
    private String phone;
}
