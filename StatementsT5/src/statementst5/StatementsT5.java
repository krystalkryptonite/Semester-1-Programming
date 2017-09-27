package statementst5;

import java.util.Scanner;

/**
 *
 * @author Kirsty
 */
public class StatementsT5
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String insuranceItem;
        double valueOfItem;
        double premiumMulti;
        double premiumFinal;
        int itemType;
        int devider;
// establish the correct insurance needed. // Using a menu system with number input make for easier comparision.
        System.out.println("Please enter the number next to the type of item you wish to insure.");
        System.out.println("1.\t Car");
        System.out.println("2.\t House");
        System.out.println("3.\t Other");
        itemType = input.nextInt();

        while (itemType < 0 && itemType > 3) // stop user from entering incorrect number
        {
            System.out.println("INVALID ENTRY.");
            System.out.println("Please enter the number next to the type of item you wish to insure.");
            System.out.println("1.\t Car");
            System.out.println("2.\t House");
            System.out.println("3.\t Other");
            itemType = input.nextInt();

        }
        if (itemType == 1)
        {
            System.out.println("You have selected Car insurance");
            premiumMulti = 0.5;
            insuranceItem = "Car";
        } else if (itemType == 2)
        {
            System.out.println("You have selected House insurance");
            premiumMulti = 0.3;
            insuranceItem = "House";
        } else
        {
            System.out.println("You have selected Other insurance");
            premiumMulti = 0.65;
            insuranceItem = "Other";
        }
        //ask for value of insurance item
        System.out.println("Please enter the value of the item you wish to insure. ");
        valueOfItem = input.nextDouble();
      
        if (valueOfItem <= 0 && valueOfItem < 5000)         //calculate premium
        {
            devider = 5;
        } else if (valueOfItem >= 5000 && valueOfItem < 10000)
        {
            devider = 8;
            
        } else                          
        {
            devider = 10;
        }
        premiumFinal = valueOfItem / devider * premiumMulti;
        
        //display final calculation of premium. yeehaaw
        System.out.println("Your insurance premium is:\t" + premiumFinal);
    }

}
