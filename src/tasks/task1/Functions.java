package tasks.task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Utils
public class Functions {
    static int countOfTriples(String str) {
        Set<String> symbols = getUniqueSymbols(str);

        int count = 0;

        for(String c: symbols) {
            Pattern pattern = Pattern.compile(c + c + c);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                count++;
            }
        }

        return count;
    }

    static Set<String> getUniqueSymbols(String str) {
        return new HashSet<>(Arrays.asList(str.split("")));
    }
}
