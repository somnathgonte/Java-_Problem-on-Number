
//Accept one number from user and find product of their digit.

//Input: 1234
//Output: 24

import java.util.Scanner;

public class ProductOfDigit 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int product = 1;  

        while(num != 0)
        {
            int rem = num%10;

            if(rem != 0)                   //Filtration to avoid zero.
            {
            product = product * rem;
            }

            num = num/10;
        }
        System.out.println(product);               //Print output
    }
    
}
