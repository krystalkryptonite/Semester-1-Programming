import java.util.Scanner; 
/**
 *
 * @author Kirsty
 */
public class StatementsT2 {

  
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    int inputAge;   // I only need one variable here
    
        System.out.println("Hello, welcome to the cinema!\nPlease enter your age to determine your ticket price.");
    
        inputAge = input.nextInt();
        
        if (inputAge <5)       // commence the if statements!
        {
       
            System.out.println("Great news, you get to go see your movie for FREE!");
        }
        else if (inputAge >= 5 && inputAge <= 12)
        {
            System.out.println("Woohoo, you get in to the movies for half price! Lucky you.");
        }
        else if (inputAge >= 13 && inputAge <=54) 
        {
           System.out.println("You will pay Full Price for tickets this time around my friend.");
        
        }
        else
        {
            System.out.println("Dont worry grab some snacks, you get in for FREE!");
       
        }
    
    }
    
}
