package com.springcore.autowirebyannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

    @Autowired
    private Address address;

    // Default Constructor
    public Emp( ) {
    System.out.println("Inside Default Constructor of EMP");
    }

    @Autowired
    public Emp(Address address) {
        System.out.println("Inside Parameterised  Constructor of Emp");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        System.out.println("Inside EMP setting address");
        this.address = address;
    }


    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }



}
