package FrescoPlayChallenges.Packages;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractString{

    private String secretCode = "";

    NumberFinder numberFinder = new NumberFinder();

    public String getInput(String conversation) {
        return this.secretCodeExctracter(conversation);
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

    public String secretCodeExctracter(String cnv){

        String conversation = stringFilter(cnv);

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

    private static Map<String, Integer> createNumberWordsMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        map.put("eleven", 11);
        map.put("twelve", 12);
        map.put("thirteen", 13);
        map.put("fourteen", 14);
        map.put("fifteen", 15);
        map.put("sixteen", 16);
        map.put("seventeen", 17);
        map.put("eighteen", 18);
        map.put("nineteen", 19);
        map.put("twenty", 20);
        return map;
    }


}
