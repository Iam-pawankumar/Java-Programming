package tcsNQT;

import java.util.Arrays;

public class LargestNum {

    public String minNum(int[] arr){
        String sol = "";
        Arrays.sort(arr);
        sol = String.valueOf(arr[0]);
        return sol;
    }

    public String maxNum(int[] arr){
        String sol = "";
        Arrays.sort(arr);
        sol = String.valueOf(arr[arr.length-1]);
        return sol;
    }

    public String largestNum(int[] arr){
        Arrays.sort(arr);
        String res = "";
        for (int i = (arr.length-1); i >= 0; i--) {
            res += arr[i];
        }
        return res;
    }

    public String emptyChocolates(int[] arr){
        String addZeros = "";
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                addZeros += "0";
            }else{
                res += String.valueOf(arr[i]);
            }
        }
        return res+addZeros;
    }

    public static void main(String[] args) {
        LargestNum solution = new LargestNum();
        int[] arr = {4,7,9,2,3};
        int[] arr1 = {22,14,8,17,35,3};
        int[] arr2 = {4,5,0,1,9,0,5,0};
        System.out.println("Largest Number is: " + solution.largestNum(arr));
        System.out.println("Min number is: " + solution.minNum(arr1));
        System.out.println("Max number is: " + solution.maxNum(arr1));
        System.out.println("Empty chocolates at end : " + solution.emptyChocolates(arr2));
    }
}
