package Arrays;

import java.util.Arrays;

public class SecondLargestElement {

    public static int secondLargestEle(int[] array){
        if(array.length == 0){
            return -1;
        }

        int firstLargestNum = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for(int value: array){
            if(value > firstLargestNum) {
                secondLargestNum = firstLargestNum;
                firstLargestNum = value;
            } else if( value > secondLargestNum && value != firstLargestNum){
                secondLargestNum = value;
            }
        }
        return (secondLargestNum > 0) ? secondLargestNum : -1;
    }

    public static void main(String []args){
        int[] array = new int[]{5, 5, 4, 4, 4};
        String intVal = "";
        for(int val: array){
            intVal = intVal + " " + val;
        }
        System.out.println("Second Largest element in array: " + intVal + " is: " + secondLargestEle(array));
    }
}
