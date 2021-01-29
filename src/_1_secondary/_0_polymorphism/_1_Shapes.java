package _1_secondary._0_polymorphism;

public class Shapes {
    public static void main(String[] args) {
        Shape s = new Shape();
        Shape rectangle = new Rectangle();
        Rectangle rect = new Square();
        Shape square = new Square();
        //This wouldn't work because not all rectangles are squares
        //Square sq = new Rectangle();
    }
}

class Shape {}

class Rectangle extends Shape {}

class Square extends Rectangle {}
