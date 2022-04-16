import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            long[] arr1 = new long[a];
            long[] arr2 = new long[a];
            for (int i = 0; i < a; i++) {
                arr1[i] = in.nextLong();
            }
            for (int i = 0; i < a; i++) {
                arr2[i] = in.nextLong();
            }
            long sum = 0;

            for (int i = 0; i < a - 1; i++) {
                sum += Math.abs(arr1[i] - arr2[i + 1]);
            }
            for (int i = 0; i < a - 1; i++) {
                sum += Math.abs(arr1[i + 1] - arr2[i]);
            }
            System.out.println(sum);

        }
    }
}
