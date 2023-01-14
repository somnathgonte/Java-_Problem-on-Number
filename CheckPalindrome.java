
//Accept one number from user and check given number is palindrome or not.

//Input: 12321
//Output: It is Palindrome number.

import java.util.Scanner; 
public class CheckPalindrome 
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo1 = sc.nextInt();

        int temp = iNo1;

        int reverse = 0;
        
        while(iNo1 != 0)
        {
            int rem = iNo1%10;

            reverse = (reverse * 10) + rem;

            iNo1 = iNo1/10;
        }
        if(temp == reverse)
        {
            System.out.println("It is a Palindrome number");
        }
        else
        {
            System.out.println("It is not a Palindrome number");
        }
    }
    
}
