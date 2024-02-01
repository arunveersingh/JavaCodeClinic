package com.oopsfeedmecode.example7.worksheet.one;

import java.util.Optional;

public class BusinessClass {

    // FIXME: Use Optional to eliminate the need of null checks
    public Optional<String> getCustomerAddress(Customer customer) {
        return Optional.ofNullable(customer)
                .map(Customer::getAddress)
                .map(Address::getCity)
                .map(City::getName);
    }

    // Test the method
    public static void main(String[] args) {
        City city = new City("New York");
        Address address = new Address(city);
        Customer customer = new Customer(address);

        BusinessClass business = new BusinessClass();
        Optional<String> addressName = business.getCustomerAddress(customer);
        System.out.println(addressName); // Output: New York

        Optional<String> noAddress = business.getCustomerAddress(null);
        System.out.println(noAddress); // Output: null
    }
}

class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() { return address; }
}

class Address {
    private City city;

    public Address(City city) {
        this.city = city;
    }

    public City getCity() { return city; }
}

class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

