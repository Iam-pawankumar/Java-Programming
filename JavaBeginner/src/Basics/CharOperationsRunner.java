package Basics;

public class CharOperationsRunner {

    public static void main(String []args){
        CharOperations charOps = new CharOperations();
        System.out.println(charOps.isVowel('a'));
        System.out.println(charOps.isConsonent('B'));
        System.out.println(charOps.isAlphabet('Z'));
        System.out.println(charOps.isNumber('1'));
        CharOperations.printLowerCaseAlphabets();
        CharOperations.printUpperCaseAlphabets();
    }
}
