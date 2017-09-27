package statementst4;

import java.util.Scanner;

public class StatementsT4
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String earningCode;
        long employeeEarnings;
        int employeeSkillInput;
        char employeeSkillCode;

        /// Work out howw much they earn to get tax code
        System.out.println("Hello, please input your annual earnings.");
        employeeEarnings = input.nextLong();

        // while user input is <0 ask for user input 
        while (employeeEarnings < 0)
        {
            System.out.println("Please enter a number greater than 0.");
            employeeEarnings = input.nextLong();
        }

        // save user input for employee earnings
        if (employeeEarnings >= 0 && employeeEarnings < 5000)
        {
            earningCode = "100";
        } else if (employeeEarnings >= 5000 && employeeEarnings < 10000)
        {
            earningCode = "150";
        } else if (employeeEarnings >= 10000 && employeeEarnings < 20000)
        {
            earningCode = "200";
        } else if (employeeEarnings >= 20000 && employeeEarnings < 50000)
        {
            earningCode = "500";
        } else
        {                                    //work out tax code 
            earningCode = "1000";
        }

        /// Determine skill
        System.out.println("Please enter which option best describes your main skillset.");
        System.out.println("1.\t Unskilled");
        System.out.println("2.\t Tradesmen");
        System.out.println("3.\t Computing and telecoms");
        System.out.println("4.\t Administration");
        employeeSkillInput = input.nextInt();

        while (employeeSkillInput <= 0 || employeeSkillInput >= 5)
        {
            System.out.println("Invalid input, please input a number that matches your skillset.");
            System.out.println("1.\t Unskilled");
            System.out.println("2.\t Tradesmen");
            System.out.println("3.\t Computing and telecoms");
            System.out.println("4.\t Administration");
            employeeSkillInput = input.nextInt();
        }
        // assign char to skill
        if (employeeSkillInput == 1)
        {
            System.out.println("You have selected unskilled.");
            employeeSkillCode = 'A';
        } else if (employeeSkillInput == 2)
        {
            System.out.println("You have selected Tradesmen.");
            employeeSkillCode = 'T';
        } else if (employeeSkillInput == 3)
        {
            System.out.println("You have selected Computing And Telecoms.");
            employeeSkillCode = 'C';
        } else
        {
            System.out.println("You have selected Administration.");
            employeeSkillCode = 'E';
        }
        /// Concat tax code and skill
        System.out.println("Your Tax code is: \t " + earningCode + employeeSkillCode);
    }
}
