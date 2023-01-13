//Accept one number from user and check given number is Spy number or Not.

/*
A number is said to be a Spy number 
if the sum of all the digits is equal to the product of all digits.

Input : 1412
Output : Spy Number
Explanation : 
sum = (1 + 4 + 1 + 2) = 8
product = (1 * 4 * 1 * 2) = 8
since, sum == product == 8

Input : 132
Output : Spy Number
Explanation : 
sum = (1 + 3 + 2) = 6
product = (1 * 3 * 2) = 6
since, sum == product == 6
*/

import java.util.*;
public class CheckSpy 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int num = sc.nextInt();

        int sum = 0;                                    //Varible initialisation for sum
        int product = 1;                                //Variable initialisation for product

        while(num != 0)
        {
            int rem = num%10;                             //It is used for find the digit

            sum = sum + rem;                              //Summation
            
            if(rem != 0)                                  //filter for if number is non negative 
            {
            product = product * rem;
            }

            num = num/10;                                 //Updator
        }
        if(sum==product)
        {
            System.out.println("The number is "+"a Spy number");
        }
        else 
        {
            System.out.println("It is not" + "a Not Spy number.");
        }
    }
    
}
