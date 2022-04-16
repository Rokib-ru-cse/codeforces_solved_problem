import java.util.Scanner;

public class SumofRoundNumbers_1352A {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t-->0){
            int a = in.nextInt();
            int i = 0;
            StringBuilder sb = new StringBuilder();
            while(a%10!=0 && a>9){
                sb.append(String.valueOf((int)Math.pow(10,i)*(a%10))+" ");
                i++;
                a/=10;
            }
            System.out.println(i+1);
            if(i>0){
                String[] s = sb.toString().split(" ");
                for (String string : s) {
                    System.out.print(Integer.parseInt(string)+" ");
                }
            }
            if(a!=0){
                System.out.print(a*(int)Math.pow(10,i));
            }
            System.out.println();
        }
    }
}
