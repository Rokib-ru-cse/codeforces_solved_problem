import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Dragons_230A {
    public static void main(String[] args) {
        int s, n;
        Scanner in = new Scanner(System.in);
        s = in.nextInt();
        n = in.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            Integer a = in.nextInt();
            Integer b = in.nextInt();
            map.put(a, b);
        }
        boolean flag = true;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getKey() < s) {
                s += e.getValue();
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
