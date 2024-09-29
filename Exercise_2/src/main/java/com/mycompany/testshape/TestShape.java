package com.mycompany.testshape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle(5.0);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle);

        Square square = new Square(2.0);
        System.out.println(square);
        square.setWidth(5.0); // Changing the width of square
        System.out.println(square);
    }
}
