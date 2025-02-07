package algorithm.baekjoon;

import java.util.Scanner;

public class Main_3052 {
    public static void main(String [] args) {
        //
        //
        Scanner sc = new Scanner(System.in);
        int []a = new int[42];
        int input = 0;
        int ans = 0;

        for (int i=0;i<10;i++) {
            input = sc.nextInt();
            a[input%42]++;
        }
        for (int i=0;i<a.length;i++) {
            if(a[i] >0) {
                ans++;
            }
        }
        System.out.print(ans);
    }
}