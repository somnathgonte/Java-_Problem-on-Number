import java.util.Scanner;
public class Hcf 
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int iNo1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int iNo2 = sc.nextInt();

        int small = iNo1 < iNo2 ? iNo1 : iNo2 ;
        if(small<0)
        {
            small = -(small);   
        }
        while(small > 0)
        {
            if(iNo1%small == 0 && iNo2%small == 0)
            {
                System.out.println("The hcf of "+iNo1+" and "+iNo2+" is "+small);
                break;
            }
            small--;
        }
        
        
    }
    
}
