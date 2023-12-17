package Numbers;

public class BiNumbersRunner {

    public static void main(String args[]){
        BiNumbers numbers = new BiNumbers(2,3);
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());
        numbers.doubleNum();
        System.out.println(numbers.getNum1());
        System.out.println(numbers.getNum2());
    }
}
