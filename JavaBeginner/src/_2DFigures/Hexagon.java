package _2DFigures;

public class Hexagon {

    private int rows;
    private int cols;

    public Hexagon(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public void printHexagon(){

        String[] arr = new String[]{"20","40","11","51","02","62","13","53","24","44"};
        for (int i=0; i<=rows; i++){
            for (int j=0; j<=cols; j++){
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
