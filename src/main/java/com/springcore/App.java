package com.springcore;

import com.springcore.collections.Employee;
import com.springcore.reference.A;
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

        // Reference Inject

        ApplicationContext refernceContext = new ClassPathXmlApplicationContext("reference.xml");

        A a = (A) refernceContext.getBean("aref");

        System.out.println(a.getX());
        System.out.println(a.getObject().getY());
    }
}
