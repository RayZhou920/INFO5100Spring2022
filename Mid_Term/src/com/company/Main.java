package com.company;

public class Main {

    public static void main(String[] args) {
	    // Midterm code by rui zhou
        // Question1: Deep copy and shallow copy
        Student student1 = new Student(1, "Tony", 3.8);
        // shallow copy
        Student student2 = student1;
        // deep copy
        Student student3 = new Student(student1);
        // output the shallow copy and deep copy
        student3.setName("Daniel");
        student3.setStudentID(2);
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        // Question2: Abstract class and Interface
        // Interface:
        Pet dog = new Dog();
        dog.move();
        dog.eat();
        // Abstract class:
        Animal cow = new Cow();
        cow.makeSound();
        cow.eat();
    }
}
