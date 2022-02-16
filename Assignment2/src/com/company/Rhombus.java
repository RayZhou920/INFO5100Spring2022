package com.company;

public class Rhombus extends Shape {
    double d1;
    double d2;

    public Rhombus(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public Rhombus(double d1) {
        this.d1 = d1;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public double getArea(double d1, double d2) {
        return (d1 * d2) / 2;
    }

    public double getPerimeter(double d1, double d2) {
        double sum = Math.pow(d1, 2) + Math.pow(d2, 2);
        double value = Math.sqrt(sum);
        return value;
    }
}
