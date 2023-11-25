package Basics.String;

import java.util.Arrays;

public class StringManupulation{

    public String getBigWord(String sentance){

        String []words = sentance.split(" ");

        int maxLenOfWord = 0;
        String bigWord = "";

        for (String word: words){
            if (word.length() > maxLenOfWord){
                maxLenOfWord = word.length();
                bigWord = word;
            }
        }
        return bigWord;
    }

    public String getSmallWord(String sentance){

        String []words = sentance.split(" ");

        int minLenOfWord = words.length;
        String smallWord = "";

        for (String word: words){
            if (word.length() < minLenOfWord){
                minLenOfWord = word.length();
                smallWord = word;
            }
        }
        return smallWord;
    }


}
