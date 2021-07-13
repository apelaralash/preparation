import java.util.Scanner;

public class Execise2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        int sum = 0;

        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }

        System.out.println(sum);
    }
}
