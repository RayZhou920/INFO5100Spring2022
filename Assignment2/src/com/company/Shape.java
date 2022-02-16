package com.company;

public class Shape {
    String name;
    String color;
    double area;
    double perimeter;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, double area, double perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public Shape() {
        return;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Create printShape() method in Shape class that returns desired string output.
    public void printShape(Shape shape) {
        System.out.println(shape + "name: " + shape.getName());
        System.out.println(shape + "color: " + shape.getColor());
        System.out.println(shape + "area: " + shape.getArea());
        System.out.println(shape + "perimeter: " + shape.getPerimeter());
    }

    public void display() {
        System.out.println("Shape Information: ");
        System.out.println("Name: " + this.getName());
        System.out.println("Color: " + this.getColor());
    }

}
