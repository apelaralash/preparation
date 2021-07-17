package task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String number = console.nextLine();

        String[] numZero = new String[]{"  000  ", " 0   0 ", "0     0", "0     0", "0     0", " 0   0 ", "  000  "};
        String[] numOne = new String[] {" 1 ", "11 ", " 1 ", " 1 ", " 1 ", " 1 ", "111"};
        String[] numTwo = new String[] {" 222 ", "2   2", "2  2 ", "  2  ", " 2   ", "2    ", "22222"};
        String[] numThree = new String[] {" 333 ", "3   3", "    3", " 333 ", "    3", "3   3", " 333 "};
        String[] numFour = new String[] {"   4 ", "  44 ", " 4 4 ", "4  4 ", "44444", "   4 ", "   4 "};
        String[] numFive = new String[] {" 5555", "5    ", "5    ", " 555 ", "    5", "    5", "5555 "};
        String[] numSix = new String[] {" 666 ", "6   6", "6    ", "6666 ", "6   6", "6   6", " 666 "};
        String[] numSeven = new String[] {"77777", "    7", "   7 ", "  7  ", " 7   ", "7    ", "7    "};
        String[] numEight = new String[] {" 888 ", "8   8", "8   8", " 888 ", "8   8", "8   8", " 888 "};
        String[] numNine = new String[] {" 9999", "9   9", "9   9", " 9999", "    9", "    9", "    9"};

        for(int i = 0; i < 7; i++){
            for (int j = 0; j < number.length(); j++) {
                switch (number.charAt(j)) {
                    case '0' -> System.out.print(numZero[i] + "  ");
                    case '1' -> System.out.print(numOne[i] + "  ");
                    case '2' -> System.out.print(numTwo[i] + "  ");
                    case '3' -> System.out.print(numThree[i] + "  ");
                    case '4' -> System.out.print(numFour[i] + "  ");
                    case '5' -> System.out.print(numFive[i] + "  ");
                    case '6' -> System.out.print(numSix[i] + "  ");
                    case '7' -> System.out.print(numSeven[i] + "  ");
                    case '8' -> System.out.print(numEight[i] + "  ");
                    case '9' -> System.out.print(numNine[i] + "  ");
                    default -> j = number.length();
                }
            }
            System.out.print("\n");
        }
    }
}
