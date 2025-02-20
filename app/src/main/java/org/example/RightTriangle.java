package org.example;

class RightTriangle extends Shape implements Polygon{
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return .5 * base * height;
    }

    public double getPerimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    public int NumberOfSides() {
        return 3;
    }
}
