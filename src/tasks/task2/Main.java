package tasks.task2;

import java.util.Scanner;

import static tasks.task2.Functions.sumOfDigits;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string:");
        String str = scanner.nextLine();

        System.out.println("The sum of the digits in the string is " +
                sumOfDigits(str) + ".");
    }
}
