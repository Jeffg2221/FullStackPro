package com.jeffgomez.demo.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
