package com.springcore;

import com.springcore.collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String args[]){

        // Getting the object from IOC for primitive data types

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        Student Student1 = (Student) context.getBean("firstStudent");

        System.out.println(Student1.toString());

        // Getting the object from IOC for Collections data types

        ApplicationContext collectionsContext = new ClassPathXmlApplicationContext("employee-configuration.xml");

        Employee Employee1 = (Employee) collectionsContext.getBean("firstEmployee");

        System.out.println(Employee1.toString());
    }
}
