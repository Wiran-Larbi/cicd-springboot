package com.dotcipher.springmasterclass.config;

import com.dotcipher.springmasterclass.dao.CustomerRepository;
import com.dotcipher.springmasterclass.dao.CustomerRepositoryFake;
import com.dotcipher.springmasterclass.dao.CustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepository:false}")
    private Boolean useFakeCustomerRepository;

    @Bean
    CommandLineRunner commandLineRunner() {

        return args -> {
            System.out.println("Command Line Runner " + args );
        };
    }

    @Bean
    CustomerRepository customerRepository(){
        System.out.println("useFakeCustomerRepository = " + useFakeCustomerRepository);
        return useFakeCustomerRepository ?
                new CustomerRepositoryFake() :
                new CustomerRepositoryImpl();
    }


}

