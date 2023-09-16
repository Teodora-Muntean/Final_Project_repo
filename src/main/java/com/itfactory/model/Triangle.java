package com.itfactory.model;

public class Triangle implements GeometricFigure {
    double sideLength1;
    double sideLength2;
    double hypotenuseLength;

    public Triangle(double sideLength1, double sideLength2, double hypotenuseLength) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.hypotenuseLength = hypotenuseLength;
    }

    public double getSideLength1() {
        return sideLength1;
    }

    public double getSideLength2() {
        return sideLength2;
    }

    public double getHypotenuseLength() {
        return hypotenuseLength;
    }

    public void setSideLength1(double sideLength1) {
        this.sideLength1 = sideLength1;
    }

    public void setSideLength2(double sideLength2) {
        this.sideLength2 = sideLength2;
    }

    public void setHypotenuseLength(double hypotenuseLength) {
        this.hypotenuseLength = hypotenuseLength;
    }

    @Override
    public double calculatePerimeter() {
        return sideLength1 + sideLength2 + hypotenuseLength;
    }

}
