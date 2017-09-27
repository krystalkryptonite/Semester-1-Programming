/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloops1;

/**
 *
 * @author Kirsty
 */
public class ForLoops1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Counting up...");
            System.out.println("The counter is:" + i);

        }
        for (int i = 10; i > 0; i--)
        {
            System.out.println("Counting Down...");
            System.out.println("The counter is: " + i);
        }
    }

}
