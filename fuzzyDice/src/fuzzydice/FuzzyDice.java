package fuzzydice;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Kirsty
 */
public class FuzzyDice
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Random rand = new Random();
        int iLimit = 6;
        int iRandomNo;
        String rollDice;
        Scanner input = new Scanner(System.in);
        //ask user to roll dice
        System.out.println("Hello, welcome to Fuzzy Dice,Please press enter to roll the dice.");
        rollDice = input.nextLine();

        iRandomNo = rand.nextInt(6) + 1;
        switch (iRandomNo)
        {   // output correct picture
            case 1:
                System.out.println("You have rolled a: " + iRandomNo);

                System.out.println("|    |");
                System.out.println("|  * |");
                System.out.println("|    |");
                System.out.println("|____|");
                break;
            case 2:
                System.out.println("You have rolled a: " + iRandomNo);

                System.out.println("|     |");
                System.out.println("|*    |");
                System.out.println("|   * |");
                System.out.println("|_____|");
                break;
            case 3:
                System.out.println("You have rolled a: " + iRandomNo);
                System.out.println("|    *|");
                System.out.println("|  *  |");
                System.out.println("| *   |");
                System.out.println("|_____| ");
                break;
            case 4:
                System.out.println("You have rolled a: " + iRandomNo);
                System.out.println("|    |");
                System.out.println("|*  *|");
                System.out.println("|*  *|");
                System.out.println("|____|");
                break;
            case 5:
                System.out.println("You have rolled a: " + iRandomNo);

                System.out.println("| * * |");
                System.out.println("|  *  |");
                System.out.println("| * * |");
                System.out.println("|_____|");
                break;
            case 6:
                System.out.println("You have rolled a: " + iRandomNo);
                System.out.println("| * * |");
                System.out.println("| * * |");
                System.out.println("| * * |");
                System.out.println("|_____|");
                break;

        }

    }

}
