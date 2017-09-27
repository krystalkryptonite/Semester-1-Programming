/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iffuzzydice;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Kirsty
 */
public class IfFuzzyDice
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Random rand = new Random();
        int iLimit = 6;
        int iRandomNo;

        Scanner input = new Scanner(System.in);
        //ask user to roll dice
        System.out.println("Hello, welcome to Fuzzy Dice,Please press enter to roll the dice.");
        input.nextLine();
        iRandomNo = rand.nextInt(6) + 1;

        if (iRandomNo == 1)
        {

            System.out.println("You have rolled a: " + iRandomNo);

            System.out.println("|    |");
            System.out.println("|  * |");
            System.out.println("|    |");
            System.out.println("|____|");

        }
     else if(iRandomNo == 2){
        
         System.out.println("You have rolled a: " + iRandomNo);

                System.out.println("|     |");
                System.out.println("|*    |");
                System.out.println("|   * |");
                System.out.println("|_____|");
        
        
        } else if(iRandomNo == 3){
        
        System.out.println("You have rolled a: " + iRandomNo);
                System.out.println("|    *|");
                System.out.println("|  *  |");
                System.out.println("| *   |");
                System.out.println("|_____| ");
        
        } else if(iRandomNo == 4){
        
        System.out.println("You have rolled a: " + iRandomNo);
                System.out.println("|    |");
                System.out.println("|*  *|");
                System.out.println("|*  *|");
                System.out.println("|____|");
        } else if (iRandomNo ==5 ){
         System.out.println("You have rolled a: " + iRandomNo);

                System.out.println("| * * |");
                System.out.println("|  *  |");
                System.out.println("| * * |");
                System.out.println("|_____|");
        }else {
        
         System.out.println("You have rolled a: " + iRandomNo);
                System.out.println("| * * |");
                System.out.println("| * * |");
                System.out.println("| * * |");
                System.out.println("|_____|");
        
        }

    }

}
