package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int number;
        try {
            number = Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.out.println("Некорректный ввод.");
            return;
        }

        for(int n = 2; n <= number; n++){
            while(number % n == 0) {
                System.out.print(n + " ");
                number /= n;
            }
        }

    }
}
