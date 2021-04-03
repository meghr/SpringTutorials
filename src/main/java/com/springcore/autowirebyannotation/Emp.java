package com.springcore.autowirebyannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    /*@Autowired
    @Qualifier("address2")*/
    private Address address;

    // Default Constructor
    public Emp( ) {
    System.out.println("Inside Default Constructor of EMP");
    }

    // @Autowired
    // Qualifier can not be used with constructor
    public Emp(Address address) {
        System.out.println("Inside Parameterised  Constructor of Emp");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("address2")
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
