package Polymorphism;

public class ComplexNums {
    public static void main(String[] args) {
        new Num(5.3);
        new Real(5);
        new Real(2.4);
        new Int(3);
    }
}

class Num {
    public Num (Number num) {
        //now prints what type it was called with (Integer or Double)
        if (num instanceof Integer) {
            System.out.println("Was called with an Integer");
        } else if (num instanceof Double) {
            System.out.println("Was called with a Double");
        }
    }
}

class Real extends Num {
    public Real (Integer num) {
        super(num);
    }
    public Real (Double doub) {
        super(doub);
    }
}

class Int extends Real {
    public Int (Integer num) {
        super(num);
    }
}
