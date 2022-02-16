package com.company;

public class Triangle extends Shape {
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double side1) {
        this.side1 = side1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(double base, double height) {
        return (base * height) / 2;
    }

    public double getPerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public double getPerimeterOfEquilateralTriangle(double side) {
        return side * 3;
    }

    public void setColor() {
        this.setColor("Black");
    }

}
