//Accept number from user and find the sum of digit.

//Input : 12345
//Output : 15

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            int rem = num % 10;

            sum = sum + rem;

            num = num / 10;
        }
        System.out.println(sum);
    }

}
