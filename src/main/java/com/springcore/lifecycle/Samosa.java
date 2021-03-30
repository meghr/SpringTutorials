package com.springcore.lifecycle;

public class Samosa {

    private double price;

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price for Samosa ::: After this Init will be called ");
        this.price = price;
    }

    public Samosa(double price) {

        this.price = price;
    }

    public Samosa(){

    }

    // Life cycle method

    // we can put any name for init and destroy method , but we need to use the same name in lifecycle.xml
    public void init(){
        System.out.println("Inside the init Method of Samosa:: Taking  Samosa ");
    }

    public void destroy(){
        System.out.println("Inside the destroy Method of Samosa:: Dumping the Samosa ");
    }



}
