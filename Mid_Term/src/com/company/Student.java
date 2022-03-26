package com.company;

// Question 1: Deep copy and shallow copy
public class Student {
    private int studentID;
    private double gpa;
    private String name;

    public Student(int studentID, String name, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
    }

    // deep copy: copy constructor
    public Student(Student s) {
        studentID = s.studentID;
        name = s.name;
        gpa = s.gpa;
    }

    @Override
    public String toString() {
        return "Student Info: " + this.name + " " + this.studentID + " " + this.gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
