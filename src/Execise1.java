import java.util.Scanner;

public class Execise1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        char curChar = str.charAt(0);
        int count = 1, countOfThree = 0;

        for(int i = 1; i < str.length(); i++){
            if(curChar == str.charAt(i)){
                count++;
            } else {
                count = 1;
                curChar = str.charAt(i);
            }
            if(count == 3){
                countOfThree++;
                count = 0;
            }
        }

        System.out.println(countOfThree);
    }
}
