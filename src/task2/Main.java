package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string:");
        String str = scanner.nextLine();

        System.out.println("The sum of the digits in the string is " + sumOfDigits(str) + ".");
    }

    private static int sumOfDigits(String str) {
        int sum = 0;

        for(char c: str.toCharArray()) {
            if(Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }

        return sum;
    }
}
