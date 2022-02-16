package com.company;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void computeArea() {
        System.out.println("Rectangle's area is " + (double)Math.round(length * width* 1));
    }

    public void computePerimeter() {
        System.out.println("Rectangle's perimeter is " + (double)Math.round((length * 2) + (width * 2)));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

@Override
    public void display() {
        System.out.println("Rectangle Information: ");
        this.computeArea();
        this.computePerimeter();
    }
}
