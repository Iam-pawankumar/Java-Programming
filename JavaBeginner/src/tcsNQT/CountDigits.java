package tcsNQT;

public class CountDigits {

    public static String reverseString(String s){
        String reversedString = "";
        int len = s.length();
        for (int i=0; i<len; i++){
            reversedString = s.charAt(i) + reversedString;
        }
        return reversedString;
    }

    public static int countDigitsInNum(long n){
        int countDigits = 0;
        while(n>0){
            n = n/10;
            countDigits++;
        }
        return countDigits;
    }

    public static void main(String[] args) {
        long num = 987;
        int res = countDigitsInNum(num);
        String word = "innim olleh";
        System.out.printf("total digits in num "+ num +" is %d", res).println();
        System.out.println("reversed String of :"+ word +" is: "+ reverseString(word));

    }
}
