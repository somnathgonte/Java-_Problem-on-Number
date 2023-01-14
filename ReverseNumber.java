
//Accept one number from user and reverse the given number.

//Input: 123456
//Output: 654321

import java.util.Scanner;
class ReverseNumber
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo1 = sc.nextInt();

        int reverse = 0;

        while (iNo1 != 0)
        {
            int rem = iNo1 % 10;

            reverse=(reverse * 10)+rem;     

            iNo1 = iNo1/10;
        }
        System.out.println(reverse);
    }
}