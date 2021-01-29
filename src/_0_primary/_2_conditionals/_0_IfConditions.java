package _0_primary._2_conditionals;

public class _0_IfConditions {
    public static void main(String[] args) {
        //basic conditional
        boolean hasAQuestion = true;
        if (hasAQuestion) {
            System.out.println("Raise your hand!!!!");
        }

        //triangle example
        double sA = 100;
        double sB = 20.3;
        double sC = 20.4;
        boolean aIsB = sA == sB;
        boolean aIsC = sA == sC;
        boolean bIsC = sB == sC;
        boolean isosceles = aIsB || bIsC || aIsC;
        if (isosceles) {
            System.out.println("The triangle is isosceles");
        }
        if (!isosceles) {
            System.out.println("The triangle is not isosceles");
        }
    }
}
