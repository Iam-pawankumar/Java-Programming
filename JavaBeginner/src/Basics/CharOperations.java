package Basics;

class CharOperations {
    boolean isVowel(char c){
        char[] vow = "aeiou".toCharArray();
        for (char i: vow){
            if (i == c)
                return true;
        }
        return false;
    }

    boolean isConsonent(char c){
        if (isAlphabet(c) && !isVowel(c)){
            return true;
        }
        return false;
    }
    boolean isAlphabet(char c){
        if((c >= 97 && c<= 122 ) || (c >= 65 && c<=90))
            return true;
        return false;
    }

    boolean isNumber(char c){
        if (c >= 48 && c<= 57)
            return true;
        return false;
    }

    public static void printLowerCaseAlphabets(){
        for(char ch= 'a' ; ch <= 'z' ; ch++) {
            System.out.printf("%c ", ch);
        }
    }

    public static void printUpperCaseAlphabets(){
        for(char ch = 'A' ; ch <= 'Z' ; ch++) {
            System.out.printf("%c ", ch);
        }
    }
}