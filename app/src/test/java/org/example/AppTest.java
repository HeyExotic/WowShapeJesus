package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  // You can write your unit tests here.
  @Test
  void CircleArea() {
    Circle circle = new Circle(5);
    assertEquals(78.54, circle.getArea(),1);
  }

  @Test
  void CirclePerimeter() {
    Circle circle = new Circle(5);
    assertEquals(31.42, circle.getPerimeter(),1);
  }

  @Test
  void RectangleArea() {
    Rectangle rectangle = new Rectangle(5, 5);
    assertEquals(25, rectangle.getArea(),1);
  }

  @Test
  void RectanglePerimeter() {
    Rectangle rectangle = new Rectangle(5, 5);
    assertEquals(20, rectangle.getPerimeter(),1);
  }

  @Test
  void RectangleSides() {
    Rectangle rectangle = new Rectangle(5, 5);
    assertEquals(4, rectangle.NumberOfSides());
  }

  @Test
  void RightTriangleArea() {
    RightTriangle righttriangle = new RightTriangle(5, 5);
    assertEquals(12.5, righttriangle.getArea(),1);
  }

  @Test
  void RightTrianglePerimeter() {
    RightTriangle righttriangle = new RightTriangle(5, 5);
    assertEquals(17.1,righttriangle.getPerimeter(),1);
  }

  @Test
  void RightTriangleSides() {
    RightTriangle righttriangle = new RightTriangle(5, 5);
    assertEquals(3, righttriangle.NumberOfSides());
  }

  @Test
  void SquareArea() {
    Square square = new Square(5);
    assertEquals(25, square.getArea(),1);
  }

  @Test
  void SquarePerimeter() {
    Square square = new Square(5);
    assertEquals(20, square.getPerimeter(),1);
  }

  @Test
  void SqaureSides() {
    Square square = new Square(5);
    assertEquals(4, square.NumberOfSides());
  }

  @Test
  void IsoscelesRightArea() {
    IsoscelesRightTriangle isoscelesrighttriangle = new IsoscelesRightTriangle(5);
    assertEquals(12.5, isoscelesrighttriangle.getArea(),1);
  }

  @Test
  void IsoscelesRightPerimeter() {
    IsoscelesRightTriangle isoscelesrighttriangle = new IsoscelesRightTriangle(5);
    assertEquals(17.1, isoscelesrighttriangle.getPerimeter(),1);
  }

  @Test
  void IsoscelesRightSides() {
    IsoscelesRightTriangle isoscelesrighttriangle = new IsoscelesRightTriangle(5);
    assertEquals(3, isoscelesrighttriangle.NumberOfSides());
  }
}
