import java.util.Arrays;
import java.util.Scanner;

public class Taxi_158B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] newarr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            newarr[i] = 0;
        }
        Arrays.sort(arr);
        for (int i = 0; i < newarr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < newarr.length; j++) {
                if (newarr[j] + arr[i] <= 4) {
                    newarr[j] += arr[i];
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (newarr[i] != 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
