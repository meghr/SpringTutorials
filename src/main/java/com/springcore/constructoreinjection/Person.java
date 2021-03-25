package com.springcore.constructoreinjection;

public class Person {

    private String name;
    private int personId;

    // constructor 1
    public Person(String name, int personId) {
        this.name = name;
        this.personId = personId;
    }
    // constructor 2
    public Person(int personId, String name) {
        this.name = name;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                '}';
    }
}
