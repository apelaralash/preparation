package tasks.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Первый вектор:");

        System.out.print("Введите начало вектора: \nx1 = ");
        x1 = scanner.nextDouble();

        System.out.print("y1 = ");
        y1 = scanner.nextDouble();

        System.out.print("Введите конец вектора: \nx2 = ");
        x2 = scanner.nextDouble();

        System.out.print("y2 = ");
        y2 = scanner.nextDouble();

        Vector v1 = new Vector(x1, y1, x2, y2);


        System.out.println("Второй вектор:");

        System.out.print("Введите начало вектора: \nx1 = ");
        x1 = scanner.nextDouble();

        System.out.print("y1 = ");
        y1 = scanner.nextDouble();

        System.out.print("Введите конец вектора: \nx2 = ");
        x2 = scanner.nextDouble();

        System.out.print("y2 = ");
        y2 = scanner.nextDouble();

        Vector v2 = new Vector(x1, y1, x2, y2);

        System.out.println("Длина первого вектора: " + v1.length());
        System.out.println("Длина второго вектора: " + v2.length());

        System.out.println("Вектор, полученный в результате произведения первого вектора на второй:\n"
                + v1.mult(v2).toString());
        System.out.println("Вектор, полученный в результате произведения второго вектора на первый:\n"
                + v2.mult(v1).toString() + "\n" + v2.mult(v1).length());
    }
}
