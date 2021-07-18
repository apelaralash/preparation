package tasks.task5;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Functions {
    static Map<String, Integer> sortByCountOfVowels(Map<String, Integer> unsortMap) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortMap.entrySet());
        list.sort((w1, w2) -> w2.getValue() - w1.getValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    static Map<String, Integer> createListOfWorks(List<String> str) {
        Map<String, Integer> words = new HashMap<>();

        int count = 0;
        for(String w: str){
            Pattern patten = Pattern.compile("[aeyuio]");
            Matcher matcher = patten.matcher(w.toLowerCase());
            if(matcher.find()){
                w = capitalizeFirstVowel(w, matcher.start(), matcher.end());
                count = countOfVowels(matcher);
            }
            words.put(w, count);
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
