package Basics.String;

public class StringMagic {

    public static boolean isDigit(char c){
        if(c>=48 && c<=57){
            return true;
        }
        return false;
    }
    public static int getRightmostDigit(String str) {
        char []charArray = str.toCharArray();
        for(char c: charArray){
            if(Character.isDigit(c)){
                return Character.getNumericValue(c);
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String sentance = "Iam a programmer and i code in Java Programming Language";
        StringManupulation stringManupulation = new StringManupulation();
        System.out.println(stringManupulation.getBigWord(sentance));
        System.out.println(stringManupulation.getSmallWord(sentance));
        System.out.println(StringMagic.getRightmostDigit("hello2world5"));

    }
}
