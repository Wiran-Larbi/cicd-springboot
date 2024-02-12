package com.dotcipher.springmasterclass.dao;

import com.dotcipher.springmasterclass.entity.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository(value = "fake")
public class CustomerRepositoryFake implements CustomerRepository {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Wiran Larbi","admin"),
                new Customer(2L, "Jamila Ahmed","user123")
        );
    }


}