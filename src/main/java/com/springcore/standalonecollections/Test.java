package com.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("standalone.xml");

        Person person = context.getBean("person1",Person.class);
        System.out.println(person.toString());
        System.out.println(person.getFriends().getClass().getName()); // here we are telling that we are using LinkedList
        System.out.println(person.getFeeStructure().getClass().getName()); // here we are telling that we are using Map


    }
}
