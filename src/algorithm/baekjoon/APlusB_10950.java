package algorithm.baekjoon;
import java.util.Scanner;

public class APlusB_10950 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [] results = new int[t];
        for(int i=0;i<t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            results[i] = a+b;
        }
        for(int v: results) {
            System.out.println(v);
        }
    }
}
