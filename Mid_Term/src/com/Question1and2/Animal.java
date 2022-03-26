package com.Question1and2;

// Abstract class - Animal
abstract class Animal {
    abstract void makeSound();
    public void eat() {
        System.out.println("I can eat.");
    }
}

// Concret class - Cat
class Cow extends Animal {
    public void makeSound() {
        System.out.println("Cow speaks meow.");
    }
}
