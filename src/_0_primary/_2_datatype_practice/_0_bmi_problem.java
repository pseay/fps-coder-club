package _0_primary._2_datatype_practice;

import java.util.Scanner;

public class _0_bmi_problem {
    public static void main(String[] args) {
        //BMI Practice Problem
        Scanner scan = new Scanner(System.in);

        System.out.print("Weight (lbs): ");
        double weight = Double.parseDouble(scan.nextLine());
        System.out.print("Height (ft): ");
        double height = Double.parseDouble(scan.nextLine());

        //changing feet to inches
        height = height / 12;

        //part 1: determining the bmi
        double bmi = 703 * weight / (height * height);

        //part 2: determining obesity
        boolean underWeight = bmi < 18.5;
        boolean overWeight = bmi >= 25;
        boolean obese = bmi > 30;
        boolean reallyObese = bmi > 40;

        boolean normal = !underWeight && !overWeight;

        //part 3: print it in a nice way
        System.out.println("BMI: " + bmi);
        System.out.println();
        System.out.println("Underweight:   " + underWeight);
        System.out.println("Normal:        " + normal);
        System.out.println("Overweight:    " + overWeight);
        System.out.println("Obese:         " + obese);
        System.out.println("Really Obese:  " + reallyObese);
    }
}
