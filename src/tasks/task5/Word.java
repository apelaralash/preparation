package tasks.task5;

public class Word {
    String word = "";
    int numOfVowels = 0;

    Word(String word, int numOfVowels) {
        this.word = word;
        this.numOfVowels = numOfVowels;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "Word='" + word + '\'' +
                ", numOfVowels=" + numOfVowels +
                '.';
    }
}
