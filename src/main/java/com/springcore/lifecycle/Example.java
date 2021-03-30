package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

    private String subject;

    public Example() {

    }

    public Example(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
        System.out.println("Setting properties of Example Class ");
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct
    public void start() {
        System.out.println("Starting the init method of Example Class");
    }

    @PreDestroy
    public void end() {
        System.out.println("Ending the end method of Example Class");
    }

}
