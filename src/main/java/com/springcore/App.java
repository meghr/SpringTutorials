package com.springcore;

import com.springcore.collections.Employee;
import com.springcore.constructoreinjection.Addition;
import com.springcore.constructoreinjection.Person;
import com.springcore.lifecycle.Example;
import com.springcore.lifecycle.Pepsi;
import com.springcore.lifecycle.Samosa;
import com.springcore.reference.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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


        // constructor injection

        // calling constructor 1

        ApplicationContext constuctorContext = new ClassPathXmlApplicationContext("constructorinjection.xml");

        Person person1 = (Person) constuctorContext.getBean("person1");

        System.out.println(person1);

        // calling constructor 2

        Person person2 = (Person) constuctorContext.getBean("person2");

        System.out.println(person2);

        // Ambiguity Constructor


        Addition addition = (Addition) constuctorContext.getBean("add");

        addition.doSum();

        // Life cycle
        // 1. init and destroy method using XML
        // for calling destroy method we need to use the object of AbstractApplicationContext as this have a registerShutdownHook  method

        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("lifecycle.xml");

        Samosa samosa = (Samosa) context1.getBean("s1");
        System.out.println(samosa.toString());

        // for calling destroy life cycle method

        // this will call the destroy method , to call the method registerShutdownHook we need to use the object of AbstractApplicationContext

        context1.registerShutdownHook();


        // 2. init and destroy method using  Interface (InitializingBean, DisposableBean)

        Pepsi pepsi = (Pepsi) context1.getBean("p1");
        System.out.println(pepsi.toString());

        // 3. init and destroy method using  Annotation (@postConstruct, @preDestroy)

        Example example = (Example) context1.getBean("example");

        System.out.println(example.toString());
    }
}
