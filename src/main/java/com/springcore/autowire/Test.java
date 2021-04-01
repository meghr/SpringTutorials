package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");

        Emp emp1 = context.getBean("emp1",Emp.class); // in this way we donot need to do type casting

        System.out.println(emp1.toString());

        Emp emp2 = context.getBean("emp2",Emp.class); // in this way we donot need to do type casting
        System.out.println(emp2.toString());

        Emp emp3 = context.getBean("emp3",Emp.class); // in this way we donot need to do type casting
        System.out.println(emp3.toString());
    }
}
