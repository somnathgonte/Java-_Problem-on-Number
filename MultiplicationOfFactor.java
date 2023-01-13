
//Accept one number from user and display multilication of factors.

//Input : 12
//Output : 144 (1*2*3*4*6)

import java.util.Scanner;
public class MultiplicationOfFactor 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iNo = sc.nextInt();

        int multi = 1;
        int start = 1;
        
        while(start < iNo)
        {
            if(iNo%start == 0)
            {
                multi = start * multi; 
            }
            start++;
        }
        System.out.println(multi);
    }
    
}
