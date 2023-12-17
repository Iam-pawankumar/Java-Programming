package _2DFigures;

public class Hexagon {
    public void printHexagon(int m, int n){

        String[] arr = new String[]{"20","40","11","51","02","62","13","53","24","44"};
        for (int i=0; i<=m; i++){
            for (int j=0; j<=n; j++){
                for(String ele: arr){
                    if (ele.equals(String.valueOf(i)+String.valueOf(j))){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
