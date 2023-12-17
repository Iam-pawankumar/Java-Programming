package _2DFigures;

public class Square {
    public void printSquare(int n){
        if (n >= 2){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i == 0 || j == 0) || (i == n-1 || j == n-1) && ( i+j>=n)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else {
            System.out.printf("Square cannot be printed with %d X %d Matrix", n,n).println();
        }
    }
}
