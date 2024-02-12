package com.dotcipher.springmasterclass.dao;

import com.dotcipher.springmasterclass.entity.Customer;
import com.dotcipher.springmasterclass.service.CustomerService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//@Primary
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    // Real Database Implementation
    @Override
    public List<Customer> getCustomers() {
        return Collections.emptyList();
    }


}
