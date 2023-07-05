
//Accept one number from the user and find the even factor of that number.

//Input: 36
//Output: 2 6 12 18 

import java.util.*;
public class CheckEvenFactor 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo1 = sc.nextInt();

        int start = 1;
        while(start < iNo1)
        {
            if(iNo1%start == 0  && start%2==0)
            {
                System.out.println(start);
            }
            start++;
        }
    }
}
