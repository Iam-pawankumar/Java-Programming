package Abstraction;

public class StudentRunner {
    public static void main(String []args){

        Student aided = new Aided();
        Student self = new SelfFinance();
        System.out.println(self.result("100 5,100 5,53 5,76 3|0,100,5"));
        System.out.println("8.18".hashCode());
    }
}
