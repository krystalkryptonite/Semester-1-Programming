/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logintaskloop;

import java.util.Scanner;

/**
 *
 * @author Kirsty
 */
public class LoginTaskLoop
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        String userID;
        String kirstyID = "1624288";
        String jamesID = "j.oliver";        //Assigning variables to use later on for comparision.
        String password;
        String jamesPass = "p@$$w0rd";
        String kirstyPass = "Kirsty123";
        boolean isLoggedIn = false;

        System.out.println("Welcome, please enter your user ID.");
        userID = input.nextLine();

        while (isLoggedIn == false)
        {
            if (userID.equals(kirstyID))
            {                                  // If the user is attempting to access Kirstys account, run this code block.
                System.out.println("Hello Kirsty");

                System.out.println("Please enter your password");
                password = input.nextLine();
                

                if (password.equals(kirstyPass))
                {
                    isLoggedIn = true;
                    
                }
            } else if (userID.equals(jamesID))
            {                            // else if the user is accessing james' accounts, run this code block. 
                System.out.println("Hello James");

                System.out.println("Please enter your password");
                password = input.nextLine();

                if (password.equals(jamesPass))
                {
                    isLoggedIn = true;
                    
                }
            }
             else
        {
            System.out.println("Access Denied."); 
            System.out.println("Please enter your Username.");
            userID = input.nextLine();
                                        // else they are accessing a non valid user account, access is denied.            
        }

        }
        System.out.println("Access Granted. Welcome " + userID );
        
    }
}
