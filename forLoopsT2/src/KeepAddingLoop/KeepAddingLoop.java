/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeepAddingLoop;

import java.util.Scanner;

/**
 *
 * @author Kirsty
 */
public class KeepAddingLoop
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double userChoice;
        double total;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number.");
        userChoice = input.nextDouble();
        total = userChoice;

        while (userChoice != 0)
        {
            total = total + userChoice;
            System.out.println("So far your total is:" + total);
            System.out.println("Please enter a number.");
            userChoice = input.nextDouble();

        }
        System.out.println("Here is your final total:" + total + "\n Have a nice day! Bye bye!");
    }

}
