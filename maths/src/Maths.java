import java.util.Scanner; 


/**
 *
 * @author Kirsty
 */
public class Maths


{
 public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        float temperature_1, temperature_2 , day_1, day_2;
           
        System.out.println("Welcome To The Weather Station");
        
        System.out.println("Please input your first temperature in decimals");
        temperature_1 = input.nextFloat();
        System.out.println("Please enter your second temperature in decimals");
        temperature_2 = input.nextFloat();
        System.out.println("Please enter your sunlight hours for the past day.");
        day_1 = input.nextFloat();
        System.out.println("Please enter your sunlight for the day before yesterday.");
        day_2 = input.nextFloat();
        System.out.println("The Weather Station Summary: ");
        System.out.println("The average temperature is " + (temperature_1 + temperature_2 /2));
        System.out.println("The average sunshine hours are " + (day_1 + day_2 /2));
        
        
    }
    
}
