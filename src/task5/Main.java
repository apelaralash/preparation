package task5;

import java.util.Scanner;

public class Main {

    static class Word {
        String word = "";
        int numOfVowels = 0;

        Word(String word, int numOfVowels) {
            this.word = word;
            this.numOfVowels = numOfVowels;
        }

        Word(String word){
            this.word = word;
            this.numOfVowels = 0;
        }

        @Override
        public String toString() {
            return "Word{" +
                    "word='" + word + '\'' +
                    ", numOfVowels=" + numOfVowels +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] w = str.split(" ");
        Word[] words = new Word[w.length];
        int count;

//        for(Word word: words){
//            System.out.println(word.toString());
//        }


        for(int i = 0; i < w.length; i++){
            count = 0;
            for(char v : w[i].toCharArray()){
                if( v == 'a' || v == 'i' || v == 'o' || v == 'u' || v == 'e' || v == 'y'
                    || v == 'A' || v == 'I' || v == 'O' || v == 'U' || v == 'E' || v == 'Y') {
                    count++;
                }
            }
            words[i] = new Word(w[i], count);
        }

        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i + 1; j < words.length - 1; j++) {
                if(words[i].numOfVowels < words[j].numOfVowels) {
                    Word tmp = words[j];
                    words[j] = words[i];
                    words[i] = tmp;
                }
            }
        }

        for(int i = 0; i < w.length; i++){
            for(char v : words[i].word.toCharArray()){
                if( v == 'a' || v == 'i' || v == 'o' || v == 'u' || v == 'e' || v == 'y') {
                    words[i].word = words[i].word.replaceFirst(""+v, ""+(char) (v - 32));
                    break;
                }
            }
        }

        for(Word word: words){
            System.out.println(word.toString());
        }
    }
}
