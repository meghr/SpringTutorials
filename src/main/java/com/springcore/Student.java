package com.springcore;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Student {

    private int studentId;
    private String studentName;
    private String studentAddress;

    // Getters

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    // Setters

    public void setStudentId(int studentId) {

        System.out.println("Setting Student Id ");
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {

        System.out.println("Setting Student Name ");
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {

        System.out.println("Setting Student Address ");
        this.studentAddress = studentAddress;
    }

    // Default Constructor

    public Student(){
        super();
    }

    // Parameterised s Constructor
    public Student(int studentId,String studentName,String studentAddress ){
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
