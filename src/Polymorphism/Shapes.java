package Polymorphism;

public class Shapes {
    public static void main(String[] args) {
        Shape s = new Shape();
        Shape rectangle = new Rectangle();
        Rectangle rect = new Square();
        Shape square = new Square();
    }
}

class Shape {}

class Rectangle extends Shape {}

class Square extends Rectangle {}
