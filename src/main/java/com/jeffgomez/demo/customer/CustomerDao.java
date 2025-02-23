package com.jeffgomez.demo.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();

    Optional<Customer> selectCustomerById(Integer id);

    void insertCustomer(Customer customer);

    boolean existsPersonWithEmail(String email);

    void deleteCustomerById(Integer customerId);

    boolean existsPersonWithId(Integer customerId);

    void updateCustomer(Customer update);
}