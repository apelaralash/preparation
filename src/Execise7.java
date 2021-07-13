import java.util.Scanner;

public class Execise7 {
    static class Safe {
        int volume;

        Safe(int vol) {
            this.volume = vol;
        }
    }

    static class Thing {
        int worth;
        int volume;

        Thing(int worth, int vol) {
            this.worth = worth;
            this.volume = vol;
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the volume of the safe: ");
        Safe safe = new Safe(console.nextInt());
        System.out.print("Enter the number of items: ");
        int num = console.nextInt();
        Thing[] items = new Thing[num];

        for(int i = 0; i < num; i++) {
            System.out.println("");
            System.out.println("Item " + (i + 1) + ": ");
            System.out.print("Enter worth: ");
            int w = console.nextInt();
            System.out.print("Enter volume: ");
            int v = console.nextInt();
            items[i] = new Thing(w, v);
        }

        int[][] mass = new int[num + 1][safe.volume + 1];

        for(int j = 0; j <= safe.volume; j++){
            mass[0][j] = 0;
        }

        for(int i = 1; i <= num; i++) {
            for(int j = 0; j <= safe.volume; j++) {
                if(items[i - 1].volume > j) {
                    mass[i][j] = mass[i - 1][j];
                }
                else {
                    mass[i][j] = Math.max(mass[i - 1][j], (mass[i - 1][j - items[i - 1].volume] + items[i - 1].worth));
                }
            }
        }

        System.out.println("Max total worth: " + mass[num][safe.volume]);
    }
}
