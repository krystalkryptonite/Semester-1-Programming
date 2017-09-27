
import java.util.Scanner;

public class LoginTask
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

        System.out.println("Welcome, please enter your user ID.");
        userID = input.nextLine();

        if (userID.equals(kirstyID))
        {                                  // If the user is attempting to access Kirstys account, run this code block.
            System.out.println("Hello Kirsty");

            System.out.println("Please enter your password");
            password = input.nextLine();

            if (password.equals(kirstyPass))
            {
                System.out.println("Access Granted. Welcome Kirsty.");
            }
        } 
        else if (userID.equals(jamesID))
        {                            // else if the user is accessing james' accounts, run this code block. 
            System.out.println("Hello James");

            System.out.println("Please enter your password");
            password = input.nextLine();

            if (password.equals(jamesPass))
            {
                System.out.println("Access Granted. Welcome James.");
            }
        } 
        else
        {
            System.out.println("Access Denied.");   // else they are accessing a non valid user account, access is denied.            
        }
    }
}
