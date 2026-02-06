import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.println("Birthday Cake's Details :");
        System.out.print("Enter message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = scanner.next();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();

        //2
        BirthdayCake order1 = new BirthdayCake(message,pound,flavor, 350);

        //3
        System.out.println(order1);

        //4
        System.out.println();
        System.out.println("Cup Cake's Details : ");
        System.out.print("Enter a flavor : ");
        String cup_flavor = scanner.next();
        System.out.print("How many piece : ");
        int piece = scanner.nextInt();

        //5
        CupCake order2 = new CupCake(piece,cup_flavor,65);

        //6
        System.out.println(order2);

        //1
        System.out.println();
        System.out.println("Smoothie fruit Details :");
        System.out.print("Enter fruit on Smoothie: ");
        String fruit = scanner.next();
        System.out.print("Enter MIX_fruit on Smoothie: ");
        String mixfruit = scanner.next();
        System.out.print("How many bottle: ");
        int bottle = scanner.nextInt();

        //2
        Smoothie order3 = new Smoothie(fruit,mixfruit,bottle,flavor,30);

        //3
        System.out.println(order3);

        //7
        System.out.println();
        System.out.print("Total price = " + (order1.calculateTotalPrice()+ order2.calculateTotalPrice() + order3.calculateTotalPrice()));
    }
}

