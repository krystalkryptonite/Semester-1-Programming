import java.util.Scanner; 

public class Shopper {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name1, name2, item1, item2, item3, item4; 
        float price1,price2, price3, price4, totalShoppingPrice1, totalShoppingPrice2, average, discount; 
        
        System.out.println("Hello! My name is El Shoppero. What is your name?");
        name1 = input.nextLine();
        System.out.println("Hello " + name1 + " Please enter your 1st item purchased.");
        item1 = input.nextLine();
        System.out.println("Perfect, and what was the price of your " + item1 +"?");
        price1 = input.nextFloat();
        System.out.println("Please enter your 2nd item purchased.");
        input.nextLine();
        item2 = input.nextLine();
        System.out.println("Very nice choice, how much did you pay for your " + item2 + "?");
        price2 = input.nextFloat();
        
        System.out.println("Hello! 2nd Shopper. What is your name?");
        input.nextLine();
        name2 = input.nextLine();
        System.out.println("Hey there " + name2 + ", Please enter your 1st item purchased.");
        item3 = input.nextLine();
        System.out.println("Perfect, and what was the price of your " + item3 +"?");
        price3 = input.nextFloat();
        input.nextLine();
        System.out.println("Please enter your 2nd item purchased.");
        item4 = input.nextLine();
        System.out.println("Very nice choice, how much did you pay for your " + item4 + "?");
        price4 = input.nextFloat();
        
        discount = 2;
       
        totalShoppingPrice1 = price1 + price2;
        totalShoppingPrice2 = price3 + price4;
        
        
        System.out.println(name1 +"'s Receipt:");
        System.out.println( item1 + "\t £" + price1);
        System.out.println( item2 + "\t £" + price2);
        System.out.println( "Total: \t £" + totalShoppingPrice1);
        float totalDiscountedShoppingPrice1 = price1 + price2 - discount;
        System.out.println("Price after discount: \t £" + totalDiscountedShoppingPrice1);
        
        System.out.println("\n\n");
        System.out.println(name2 +"'s Receipt:");
        System.out.println( item3 + "\t £" + price3);
        System.out.println( item4 + "\t £" + price4);
        System.out.println( "Total: \t £" + totalShoppingPrice2);
        float totalDiscountedShoppingPrice2 = price3 + price4 - discount;
        System.out.println("Price after discount: \t  £" + totalDiscountedShoppingPrice2);
         
        average = (totalShoppingPrice1 + totalShoppingPrice2)/2;  
        System.out.println("\n\n");
        System.out.println("The average of all your stuff together is: £" + average );
        
                    
    }
}
