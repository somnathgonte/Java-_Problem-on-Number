
//Count tha digit of given number

//Input : 123456
//Output : 6

import java.util.Scanner;
public class CountDigit 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if(num < 0)     //Update for negative number to positive number.
        {
            num = -num;
        }

        int Count = 0;   //Initialisation.

        while(num > 0)     //Condition 
        {
            
            num = num/10;     
            Count++ ;
            
        }
        System.out.println("The count of digits of given number is: "+Count);



    }
    
}
