package com.company;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        double value = Math.PI;
        System.out.println("Circle's area is " + (double)Math.round(2 * value * radius));
    }

    public void computePerimeter() {
        double value = Math.PI;
        System.out.println("Circle's perimeter is " + (double)Math.round(value * Math.pow(radius, 2)));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

@Override
    public void display() {
        System.out.println("Circle Information: ");
        this.computeArea();
        this.computePerimeter();
    }
}
