package com.jeffgomez.demo.customer;

public record CustomerRegistrationRequest(

        String name,
        String email,
        Integer age
) {
}
