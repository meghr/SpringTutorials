package com.springcore.autowire;

public class Emp {

    private Address address;

    // Default Constructor
    public Emp( ) {
    System.out.println("Inside Default Constructor of EMP");
    }

    public Emp(Address address) {
        System.out.println("Inside Parameterised  Constructor of Emp");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

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
