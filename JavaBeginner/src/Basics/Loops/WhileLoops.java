package Basics.Loops;

public class WhileLoops {

    public void printSquareOfNums(int n){

        if (n>1){
            for (int i=1; i<=n; i++){
                System.out.print((int) Math.pow(i,2) + " ");
            }
        }
        System.out.println();
    }

    public void printCubeOfNums(int n){

        if (n>1){
            for (int i=1; i<=n; i++){
                System.out.print((int) Math.pow(i,3) + " ");
            }
        }
        System.out.println();
    }
}
