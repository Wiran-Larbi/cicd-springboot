package com.dotcipher.springmasterclass.dao;

import com.dotcipher.springmasterclass.entity.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> getCustomers();
}
