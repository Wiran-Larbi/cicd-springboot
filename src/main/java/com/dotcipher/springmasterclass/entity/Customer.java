package com.dotcipher.springmasterclass.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
//    @JsonProperty("id")
    private final long id;
//    @JsonProperty("name")
    private final String name;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;

    public Customer(long id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
    @JsonProperty("customerId")
    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}