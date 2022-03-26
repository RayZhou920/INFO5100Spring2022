package com.company;

public class Student extends Person{

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void takeQuiz(String quiz) {
        System.out.println("Student " + this.name + " takes on a quiz: " + quiz);
    }

//    public void take
}
