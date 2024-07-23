package app;

import java.util.Scanner;

public class Main {
    private final static String CASH = "EUR";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product 1: ");
        String item1 = scanner.nextLine();

        System.out.print("The price per one product in EUR is: ");
        double pricePerOne1 = scanner.nextDouble();

        System.out.print("Enter how many products were sold: ");
        int numOfProducts1 = scanner.nextInt();

        System.out.print("Enter number of the days for selling: ");
        int numOfDays1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter product 2: ");
        String item2 = scanner.nextLine();

        System.out.print("The price per one product in EUR is: ");
        double pricePerOne2 = scanner.nextDouble();

        System.out.print("Enter how many products were sold: ");
        int numOfProducts2 = scanner.nextInt();

        System.out.print("Enter number of the days for selling: ");
        int numOfDays2 = scanner.nextInt();

        double pricePerAll = numOfProducts1 * pricePerOne1;
        double priceTotal = pricePerAll * numOfDays1;
        double salesPerDay = priceTotal / numOfDays1;

        System.out.printf("Product № 1: %s, %n total sales for %s days is %s %.2f,%n sales by day is %s %.2f.\n",
                item1, numOfDays1, CASH, priceTotal, CASH, salesPerDay);

        pricePerAll = numOfProducts2 * pricePerOne2;
        priceTotal = pricePerAll * numOfDays2;
        salesPerDay = priceTotal / numOfDays2;

        System.out.printf("Product № 2: %s, %n total sales for %s days is %s %.2f,%n sales by day is %s %.2f.\n",
                item2, numOfDays2, CASH, priceTotal, CASH, salesPerDay);
    }
}
