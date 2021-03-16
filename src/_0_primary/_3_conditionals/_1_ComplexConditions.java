package _0_primary._3_conditionals;

public class _1_ComplexConditions {
    public static void main(String[] args) {
        boolean isLearning = true;
        if (isLearning) {
            System.out.println("Yay, you are learning!");
        } else {
            System.out.println("Maybe you should ask some questions to learn better!");
        }

        boolean t = true;
        boolean f = false;
        if (t == false) { // we could also say !t or t != false
            System.out.println("t is false");
        } else if (t == true && f == false) {
            System.out.println("t is true & f is false");
        } else if (t && f) {
            System.out.println("t is true & f is true");
        } else {
            System.out.println("how did we get here?");
        }
    }
}
