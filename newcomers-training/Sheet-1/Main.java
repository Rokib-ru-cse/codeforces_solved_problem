import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        long res1= (long)a*(long)b;
        long res2= (long)c*(long)d;
        long res3 = ((res1%((int)1e9))*(res2%((int)1e9)))%((int)1e9);
        // System.out.println("res1 "+res1);
        // System.out.println("res2 "+res2);
        // System.out.println("res3 "+res3);
        if(res3%100==0){
            System.out.println("00");
        }else{
            System.out.println(res3%100);
        }
    }
}
