package com.dotcipher.springmasterclass.service;


import com.dotcipher.springmasterclass.dao.CustomerRepository;
import com.dotcipher.springmasterclass.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    public List<Customer> getCustomers() {
        return this.customerRepository.getCustomers();
    }
    public Customer getCustomer(Long customerId) throws IllegalArgumentException{
        return this.customerRepository
                .getCustomers()
                .stream()
                .filter(customer -> customer.getId() == customerId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("customer not found .."));
    }

}
