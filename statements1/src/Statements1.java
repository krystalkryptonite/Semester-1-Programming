import java.util.Scanner; 


/**
 *
 * @author Kirsty
 */
public class Statements1 {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
         int lowestAge = 16; 
         int highestAge = 31; 
         int inputAge;
        
        System.out.println("Hello there, to enter this holiday park you must be between 16 & 31 \n Please input your age.");
        inputAge = input.nextInt();
        
        if ( inputAge < lowestAge || inputAge > highestAge){
            System.out.println("You are not eligible to enter this holiday park.");
            
        
        } 
        else
        {
            System.out.println("Welcome to the partaaay! \n Please enjoy your stay.");    
        
        }
        
        
    }
    
}
