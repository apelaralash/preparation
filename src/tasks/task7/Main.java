package tasks.task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the volume of the safe: ");
        Safe safe = new Safe(scanner.nextInt());

        System.out.print("Enter the number of items: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("");
            System.out.println("Item " + (i + 1) + ": ");
            System.out.print("Enter worth: ");
            int w = scanner.nextInt();
            System.out.print("Enter volume: ");
            int v = scanner.nextInt();
            safe.setItems(w, v);
        }

        safe.fillSafe();

        System.out.println("Max total worth: " + safe.getMaxWorthOfSet());
    }
}
