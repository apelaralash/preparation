package tasks.task4;

public class Functions {
    static void printPrimeFactors(int number) {
        for (int n = 2; n <= number; n++) {
            while (number % n == 0) {
                System.out.print(n + " ");
                number /= n;
            }
        }
    }
}
