package com.oopsfeedmecode.example7.worksheet.one;

public class BusinessClass {

    // FIXME: Use Optional to eliminate the need of null checks
    public String getCustomerAddress(Customer customer) {
        if (customer != null) {
            Address address = customer.getAddress();
            if (address != null) {
                City city = address.getCity();
                if (city != null) {
                    return city.getName();
                }
            }
        }
        return null;
    }

    // Test the method
    public static void main(String[] args) {
        City city = new City("New York");
        Address address = new Address(city);
        Customer customer = new Customer(address);

        BusinessClass business = new BusinessClass();
        String addressName = business.getCustomerAddress(customer);
        System.out.println(addressName); // Output: New York

        String noAddress = business.getCustomerAddress(null);
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

