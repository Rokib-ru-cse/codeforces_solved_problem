import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int max = 0;
        int x = 0, y = 0;
        String one = "";
        String nine = "";
        for (int i = 1; i <= n; i++) {
            one += "0";
            nine += "9";
        }
        int i = Integer.parseInt(one);
        int j = Integer.parseInt(nine);
        int sum = 0;
        Boolean flag = false;
        int value = 0;
        int k;
        for (k = i; k <= j; k++) {
            value = k;
            while (value > 0) {
                sum += value % 10;
                value /= 10;
                if (sum == m && m>0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
            sum = 0;
        }
        if (flag) {
            System.out.print(k + " ");
            while (k > 0) {
                System.out.print(k % 10);
                k /= 10;
            }
            System.out.println();
        } else {
            System.out.println(-1 + " " + -1);
        }
    }
}
