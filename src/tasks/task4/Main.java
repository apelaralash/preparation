package tasks.task4;

import java.util.Scanner;

import static tasks.task4.Functions.printPrimeFactors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.err.println("Invalid input! Please try again.");
            scanner.next();
        }

        int number = scanner.nextInt();

        System.out.println("\nPrime factors of " + number + ":");
        printPrimeFactors(number);
    }
}
