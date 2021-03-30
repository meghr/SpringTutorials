package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {



    private double price;

    public Pepsi() {

    }
    public Pepsi(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("Setting price for Pepsi ::: After this Init will be called");
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

        // This method is init inherited from InitializingBean interface
    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Inside the init Method of Pepsi::Taking Pepsi ");
    }

        // This method is destroy method  from DisposableBean interface
    public void destroy() throws Exception {

        System.out.println("Inside the Destroy  Method of Pepsi::Dumping the  Pepsi bottle");
    }

}
