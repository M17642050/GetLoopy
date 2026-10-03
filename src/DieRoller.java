import java.util.Scanner;
import java.util.Random;
public class DieRoller {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        boolean loop = true;
        System.out.println("|   Roll   |   Die1   |   Die2   |   Die3   |   Sum   |");
        System.out.println("_________________________________________________________________");
        for (int i = 1; loop; i++) {
            Random rnd = new Random();
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int die3 = rnd.nextInt(6) + 1;
            int diceSum = die1 + die2 + die3;
            System.out.println("|    " + i + "    |    " + die1 + "    |    " + die2 + "    |    " + die3 + "    |    " + diceSum + "    |");
            if (die1 == die2 && die2 == die3) {
                loop = false;
            }
            else {
                boolean loopUserChoice = true;
                do {
                    System.out.print("Roll the dice again? Y/n: ");
                    String userChoice = in.nextLine();
                    if (userChoice.equals("Y")) {
                        loop = true;
                        loopUserChoice = false;
                    } else if (userChoice.equals("n")) {
                        loop = false;
                        loopUserChoice = false;
                    } else {
                        System.out.println("Invalid Input. Please enter either 'Y' to continue to roll the dice, or 'n' to exit.");
                    }
                }
                while (loopUserChoice);
            }
        }
    }
}