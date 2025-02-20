package org.example;

class Rectangle extends Shape implements Polygon{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width + height + width + height;
    }

    public int NumberOfSides() {
        return 4;
    }
}
