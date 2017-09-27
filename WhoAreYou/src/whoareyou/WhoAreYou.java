package whoAreYou;

import java.util.Scanner;

/**
 *
 * @author Kirsty
 */
public class WhoAreYou
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        boolean validInput = false;
        char userType;
        Scanner input = new Scanner(System.in);

        //ask user who they are
        System.out.println("Hello, Please enter the character which best describes you.");
        System.out.println("S: \t Student");
        System.out.println("R: \t Retired");
        System.out.println("W: \t Working");
        System.out.println("C: \t Child");
        userType = input.next().charAt(0); // take input from user
        while (validInput == false) //Loop whilst input is not valid.
        {
            switch (userType)
            { //output correct display message using switch 
                case 'S':
                case's':
                    System.out.println("Hello Student!");
                    validInput = true;
                    break;
                case 'R':
                case'r':
                    System.out.println("Hello Retired!");
                    validInput = true;
                    break;
                case 'W':
                case 'w':
                    System.out.println("Hello Working!");
                    validInput = true;
                    break;
                case 'C':
                case 'c':
                    System.out.println("Hello Child!");
                    validInput = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter S,R,W or C.");
                    System.out.println("S: \t Student");
                    System.out.println("R: \t Retired");
                    System.out.println("W: \t Working");
                    System.out.println("C: \t Child");
                    userType = input.next().charAt(0);
                    break;
            }
        }
    }

}

