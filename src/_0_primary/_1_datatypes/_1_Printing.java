package _0_primary._1_datatypes;

public class _1_Printing {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str);

        int i = 0;
        double d = 0;
        char c = 'c';
        System.out.println("int: " + i);
        System.out.println("double: " + d);
        System.out.println("char: " + c);

        System.out.println();
        System.out.print("Now for the difference between print() & println(): ");
        System.out.println("There wasn't a line break before this");
        System.out.print("There was before this (but there ain't after)");
    }
}
