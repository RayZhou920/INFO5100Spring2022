package com.company;

// Question1: Implement given program using copy constructor by creating a class Student with two parameter
public class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student student) {
        this.rollNumber = student.rollNumber;
        this.name = student.name;
    }

    public int printRoll() {
        return rollNumber;
    }

    public void setRoll(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String printName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
