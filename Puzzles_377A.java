import java.util.Arrays;
import java.util.Scanner;

public class Puzzles_377A {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }
        int arr1[] = new int[n];
        int min = 1000000;
        for (int i = 0; i <= m-n; i++) {
            for (int j = i; j <=m-n ; j++) {
                arr1[0]=arr[i];
                for (int j2 = 1; j2 < n; j2++) {
                    arr1[j2] = arr[j+j2];
                }
                
                
                for (int k = 0; k < n; k++) {
                    System.out.print(arr1[k]+" ");
                }
                Arrays.sort(arr1);
                int a =arr1[0];
                int b= arr1[n-1];
                if((b-a)<min){
                    min =b-a;
                }
                
                System.out.print(b-a);
                System.out.println();
            }
        }
        System.out.println(min);
    }
}

