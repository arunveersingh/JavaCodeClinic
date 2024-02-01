package com.oopsfeedmecode.example7.worksheet.two;

public class BusinessClass {

    // FIXME: Use Null Object Design pattern
    public String getCustomerAddress(ICustomer customer) {
        return customer.getAddress().getCity().getName();
    }

    // Test the method
    public static void main(String[] args) {
        City city = new City("New York");
        Address address = new Address(city);
        Customer customer = new Customer(address);

        BusinessClass business = new BusinessClass();
        String addressName = business.getCustomerAddress(customer);
        System.out.println(addressName); // Output: New York

        String noAddress = business.getCustomerAddress(NullCustomer.getInstance());
        System.out.println(noAddress); // Output: null
    }
}

interface ICustomer {
    IAddress getAddress();
}
class Customer implements ICustomer {
    private IAddress address;

    public Customer(IAddress address) {
        this.address = address;
    }

    public IAddress getAddress() { return address !=null? address: NullAddress.getInstance(); }
}

class NullCustomer implements ICustomer {
    private static final NullCustomer NULL_CUSTOMER = new NullCustomer();

    public static NullCustomer getInstance() { return NULL_CUSTOMER; }
    @Override
    public IAddress getAddress() {
        return NullAddress.getInstance();
    }
}

interface IAddress {
    ICity getCity();
}
class Address implements IAddress {
    private ICity city;

    public Address(ICity city) {
        this.city = city;
    }

    public ICity getCity() { return city != null? city: NullCity.getInstance(); }
}

class NullAddress implements IAddress {

    private static final NullAddress NULL_ADDRESS = new NullAddress();

    public static NullAddress getInstance() { return NULL_ADDRESS; }
    @Override
    public ICity getCity() {
        return NullCity.getInstance();
    }
}

interface ICity {
    String getName();
}
class City implements ICity {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

class NullCity implements ICity {

    private static final NullCity NULL_CITY = new NullCity();

    public static NullCity getInstance() { return NULL_CITY; }
    public String getName() { return "No City"; }
}

