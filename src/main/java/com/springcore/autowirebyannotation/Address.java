package com.springcore.autowirebyannotation;

public class Address {

    private String street;
    private String city;

    // Default Constructor
    public Address() {
        System.out.println("Inside Default Constructor of Address");
    }
    public Address(String street, String city) {
        System.out.println("Inside Parameterised  Constructor of Address");
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        System.out.println("Inside Address setting street");
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("Inside Address setting city");
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


}
