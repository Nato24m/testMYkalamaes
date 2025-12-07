import java.util.Scanner;

public class Lap308 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number to input: ");
        int number = scan.nextInt();
        System.out.print("Enter number 1: ");
        int num = scan.nextInt();
        int max = num;
        int min = num;
        int even = ((num % 2 == 0) ? 1:0);
        int odd = ((num % 2 != 0) ? 1:0);
        for (int i = 2; i <= number ; i++)
        {
            System.out.print("Enter number "+i+": ");
            num = scan.nextInt();

            if (num > max )
            {
                max = num;
            }
            if ( num < min)
            {
                min = num;
            }

            if (num % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
        System.out.println("Even number = "+even);
        System.out.println("Odd  number = "+odd);
    }
}
