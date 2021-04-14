package com.springcore.streotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Student {

    @Value("MeghRaj")
    private String studentName;
    @Value("Rajgarh")
    private String city;

    // passing list using Value tag
    @Value("#{address}")
    private ArrayList<String> address;

    public Student() {
        super();
    }
    public Student(String studentName, String city, ArrayList<String> address) {
        this.studentName = studentName;
        this.city = city;
        this.address = address;
    }


    public String getStudentName() {
        return studentName;
    }



    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public ArrayList<String> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
