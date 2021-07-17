package tasks.task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the volume of the safe: ");
        Safe safe = new Safe(console.nextInt());
        System.out.print("Enter the number of items: ");
        int num = console.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("");
            System.out.println("Item " + (i + 1) + ": ");
            System.out.print("Enter worth: ");
            int w = console.nextInt();
            System.out.print("Enter volume: ");
            int v = console.nextInt();
            safe.setItems(w, v);
        }

        safe.fillSafe();

        System.out.println("Max total worth: " + safe.getMaxWorthOfSet());
    }
}
