package com.company;

public class Professor extends Person {
    public Professor(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void giveQuiz(String quiz) {
        System.out.println("Professor " + this.name + " gives a quiz: " + quiz);
    }
}
