package _0_primary._2_datatype_practice;

import java.util.Scanner;

public class _1_tourney_bracket_problem {
    public static void main(String[] args) {

        //INPUT

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players? ");
        
        int players = Integer.parseInt(scanner.nextLine());

        //PROCESSING

        //getting the number of rounds needed
        double decimalRounds = Math.log(players) / Math.log(2);
        int rounds = (int)Math.ceil(decimalRounds);

        //getting the number of players that round can accommodate
        int playersAvailable = (int)Math.pow(2, rounds);

        //getting num of available slots
        int availableSlots = playersAvailable - players;

        //getting is there a bye
        boolean bye = players%2==1;

        //OUTPUT

        System.out.println("There need to be " + rounds + " round(s)");
        System.out.println("There will be " + availableSlots + " available spots");
        System.out.println("This is a bye: " + bye);
    }
}
