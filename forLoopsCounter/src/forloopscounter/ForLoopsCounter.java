/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopscounter;
import java.util.Scanner;
/**
 *
 * @author Kirsty
 */
public class ForLoopsCounter
{  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    { 
        int userChoice;
         Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Please enter a number between 1 & 100.");
        userChoice = input.nextInt();
        
        for (int i = userChoice; i > -1; i = i-3)
        {
            System.out.println("Counting Down...");
            System.out.println("The counter is: " + i);
        }
    }
    
}
