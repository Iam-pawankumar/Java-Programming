package FrescoPlayChallenges.Packages;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractString{

    private String secretCode = "";

    NumberFinder numberFinder = new NumberFinder();

    public String getInput(String conv) {

        String conversation = stringFilter(conv);

        int sumWordNums = 0;
        for(String word: conversation.split("\\s+")){
            if(isDigit(word) && numberFinder.isKeithNumber(Integer.parseInt(word)) && !numberFinder.isPrime(word)){
                this.secretCode += word;
            }else if(convertSpelledNumberToInteger(word) != -1){
                sumWordNums += convertSpelledNumberToInteger(word);
            }
        }
        this.secretCode += sumWordNums;
        return this.secretCode;
    }

    private boolean isDigit(String s){
        for (char c : s.toCharArray()) {
            int num = c;
            if(num >= 48 && num <= 57){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static String stringFilter(String conv){
        Pattern pattern = Pattern.compile("[^a-zA-z0-9]");
        Matcher matcher = pattern.matcher(conv);
        return matcher.replaceAll(" ");
    }

    public static int convertSpelledNumberToInteger(String spelledNumber) {
        Map<String, Integer> numberWordsMap = createNumberWordsMap();
        String cleanedWord = spelledNumber.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return numberWordsMap.getOrDefault(cleanedWord, -1);
    }

    private static Map<String, Integer> createNumberWordsMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        return map;
    }


}
