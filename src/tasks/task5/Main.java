package tasks.task5;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> str = Arrays.asList(scanner.nextLine().trim().split(" "));
        List<Word> words = createListOfWorks(str);

        sortByCountOfVowels(words);

        for(Word word: words){
            System.out.println(word.toString());
        }
    }

    private static void sortByCountOfVowels(List<Word> words) {
        Collections.sort(words, new Comparator<Word>() {
            @Override
            public int compare(Word w1, Word w2) {
                return Integer.compare(w2.numOfVowels, w1.numOfVowels);
            }
        });
    }

    private static List<Word> createListOfWorks(List<String> str) {
        List<Word> words = new ArrayList<>();

        int count = 0;
        for(String w: str){
            Pattern patten = Pattern.compile("[aeyuio]");
            Matcher matcher = patten.matcher(w.toLowerCase());
            if(matcher.find()){
                w = capitalizeFirstVowel(w, matcher.start(), matcher.end());
                count = countOfVowels(matcher);
            }
            words.add(new Word(w, count));
        }

        return words;
    }

    private static String capitalizeFirstVowel(String w, int start, int end) {
        return w.substring(0, start) +
                w.substring(start, end).toUpperCase() +
                w.substring(end);
    }

    private static int countOfVowels(Matcher matcher) {
        int count = 1;
        while(matcher.find()) {
            count++;
        }
        return count;
    }
}
