package tasks.task5;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> str = Arrays.asList(scanner.nextLine().trim().split(" "));
        Map<String, Integer> words = createListOfWorks(str);

        System.out.println("Word=countOfVowels");
        System.out.println(sortByCountOfVowels(words));
    }

    private static Map<String, Integer> sortByCountOfVowels(Map<String, Integer> unsortMap) {
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {
            @Override
            public int compare(Map.Entry<String, Integer> w1, Map.Entry<String, Integer> w2) {
                return w2.getValue() - w1.getValue();
            }
        });
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    private static Map<String, Integer> createListOfWorks(List<String> str) {
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
