//Count tha digit of given number.By using for loop.

//Input : 125487
//Output : 6

import java.util.Scanner;

public class CountDigit1
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();      //Take number from user (125487)

        if(num < 0)       //Updator for negative to positive value.
        {
            num = -num;
        }

        int Count = 0;      

        for(Count = 0 ; num > 0 ; Count++)   //For loop
        {
            num = num/10;
        }
        System.out.println("The count of digit of given number is: "+Count);

    }
    
}
