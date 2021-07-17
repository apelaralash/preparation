package tasks.task1;

import java.util.*;

import static tasks.task1.Functions.countOfTriples;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string:");
        String str = scanner.nextLine();

        System.out.println("There are " + countOfTriples(str) + " triples in the string.");
    }
}
