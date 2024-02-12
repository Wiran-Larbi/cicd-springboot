package com.dotcipher.springmasterclass.controller;

import com.dotcipher.springmasterclass.entity.Customer;
import com.dotcipher.springmasterclass.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping(path = "api/v2/customer")
@RestController
@Deprecated
public class CustomerControllerOld {
    private final CustomerService customerService;

    @Autowired
    public CustomerControllerOld(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomers(){
        return Arrays.asList(new Customer(1L, "Manal", "admin"),new Customer(2L, "Mohammed", "admin2"));
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long customerId){
        return this.getCustomer(customerId);
    }

    @PostMapping
    void createCustomer(@RequestBody Customer customer){
        System.out.println("POST REQUEST ...");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("UPDATE REQUEST ...");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long customerId){
        System.out.println("DELETE REQUEST ...");
        System.out.println("Customer Id To delete = " + customerId);
    }

}