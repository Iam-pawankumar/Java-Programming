package FrescoPlayChallenges.Packages;

public class NumberFinder {

    public boolean isPrime(String s) {
        int num = Integer.parseInt(s);
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isKeithNumber(int number) {
        int length = ("" + number).length();
        int temp = number;
        int[] arr = new int[length];
        for (int i = length-1; i >= 0 ; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }
        int sum = 0;
        while (sum < number) {
            sum = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
                sum += arr[i];
            }
            arr[length - 1] = sum;
        }
        return (sum == number);
    }
}
