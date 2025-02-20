package org.example;

public class App {
  public static void main(String[] args) {

    Circle circle = new Circle(5);

    System.out.println("The area for a circle with a radius of 5 cm: " + circle.getArea() + " cm^2");
    System.out.println("The perimeter for a circle with a radius of 5 cm: " + circle.getPerimeter() + " cm");

    Rectangle rectangle = new Rectangle(5, 5);

    System.out.println("\nThe area for a rectangle with a width of 5 cm and height of 5 cm: " + rectangle.getArea() + " cm^2");
    System.out.println("The perimeter for a rectangle with a width of 5 cm and height of 5 cm: " + rectangle.getPerimeter() + " cm");
    System.out.println("Number of sides on a rectangle: " + rectangle.NumberOfSides() + " sides");

    RightTriangle righttriangle = new RightTriangle(5, 5);

    System.out.println("\nThe area for a right triangle with a base of 5 cm and a height of 5 cm: " + righttriangle.getArea() + " cm^2");
    System.out.println("The perimeter for a rectangle with a base of 5 cm and a height of 5 cm: " + righttriangle.getPerimeter() + " cm");
    System.out.println("Number of sides on a right triangle: " + righttriangle.NumberOfSides() + " sides");

    Square square = new Square(5);

    System.out.println("\nThe area for a Square with all side lengths of 5 cm: " + square.getArea() + " cm^2");
    System.out.println("The perimeter for a Square with all side lengths of 5 cm: " + square.getPerimeter() + " cm");
    System.out.println("Number of sides on a sqaureL " + square.NumberOfSides() + " sides");

    IsoscelesRightTriangle isoscelesrighttriangle = new IsoscelesRightTriangle(5);

    System.out.println("\nThe area for a isosceles right triangle with side lenghts of 5 cm: " + isoscelesrighttriangle.getArea() + " cm^2");
    System.out.println("The perimeter of an isosceles right triangle with side lengths of 5 cm: " + isoscelesrighttriangle.getPerimeter() + " cm");
    System.out.println("Number of sides on an isosceles right triangle: " + isoscelesrighttriangle.NumberOfSides() + " sides");


  }
}
