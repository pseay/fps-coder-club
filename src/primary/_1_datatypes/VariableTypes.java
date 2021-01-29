package primary._1_datatypes;

public class VariableTypes {
    public static void main(String[] args) {
        //If we want to store a negative or positive whole number (AKA an Integer)
        //then we use an int
        int i1 = -555;
        int i2 = 0;
        int i3 = 3456;
        //int i4 = 5.4; // would not work because ints cannot store decimals

        //If we want to store a decimal number
        //then we use a double
        double d1 = 55.55;
        double d2 = 0;
        double d3 = -34.56;
        double d7 = 500.0/237;

        //If we want to store letters, or words, or sentences
        //then we use a String
        String s1 = "HEY, I'm a String";
        String s2 = "I'm not a number";
        String s3 = "";
        //String s4 = 4; // would not work because Strings cannot store numbers

        //If we want to hold true or false
        //then we use booleans
        boolean b1 = true;
        boolean b2 = false;
        //boolean b3 = 0; // they cannot be set to 1 or 0

        //you can also use these
        char c = 'A'; //can hold letters
        float f = 0.5F; //can hold small decimals
        short s = 1; //can hold up to 2^16 values
        byte b = 127; //can hold 255 numbers (-128 - 127)
        long l = 9_000_000_000_000_000_000L; //can hold really really large numbers
    }
}
