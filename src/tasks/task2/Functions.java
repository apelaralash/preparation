package tasks.task2;

public class Functions {
    static int sumOfDigits(String str) {
        int sum = 0;

        for(char c: str.toCharArray()) {
            if(Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }

        return sum;
    }
}
