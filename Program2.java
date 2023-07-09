// Take a number from user and check whether it is prime number or not.


import java.util.Scanner;
public class Program2 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo1 = sc.nextInt();

        int i=0;
        for(i=2; i<iNo1; i++)
        {
            if(iNo1%i==0)
            {
                break;
            }
        }
        if(iNo1==i)
        {
            System.out.println(iNo1+" it is prime number");
        }
        else 
        {
            System.out.println("It is not a prime number");
        }
    }   
}
