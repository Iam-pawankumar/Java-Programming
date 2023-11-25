package Basics.Loops;

public class MyNumbers {

    public boolean isPrime(int n){
        if (n<2){
            return false;
        }
        for (int i=2; i<n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public int sumOfNums(int n){
        if (n>0){
            int sum = 0;
            for (int i=1; i<=n; i++){
                sum += i;
            }
            return sum;
        }
        return 0;
    }

    public void printNumsTriangle(int n){
        if (n>=2){
            for (int i=1; i<=n; i++){
                for (int j=1; j<=i; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
