package Basics.Loops;

public class MyNumbersRunner {
    public static void main(String []args){
        MyNumbers number = new MyNumbers();
        WhileLoops whileLoops = new WhileLoops();
        whileLoops.printSquareOfNums(5);
        whileLoops.printCubeOfNums(5);
        System.out.println(number.isPrime(3));
        System.out.println(number.sumOfNums(5));
        number.printNumsTriangle(5);

    }
}
