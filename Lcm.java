import java.util.Scanner;
public class Lcm 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int iNo1 = sc.nextInt();

        System.out.println("Enter Second number: ");
        int iNo2 = sc.nextInt();
        
        int large = iNo1 > iNo2 ? iNo1 : iNo2 ;

        while(true)
        {
            if(large%iNo1 == 0 && large%iNo2 == 0)
            {
                System.out.println("The LCM of "+iNo1+" and "+iNo2+" is: "+large);
                break;
            }
            large ++;
            

        }
    }
    
}
