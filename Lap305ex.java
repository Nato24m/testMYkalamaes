import java.util.Scanner;

public class Lap305ex {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first  number: ");
        int first_number = scan.nextInt();
        System.out.print("Enter the second number: ");
        int second_number = scan.nextInt();
        for ( int i = first_number;i <= second_number ; i++)
        {
            System.out.print(i+" ");
            i++;
        }
    }
}
