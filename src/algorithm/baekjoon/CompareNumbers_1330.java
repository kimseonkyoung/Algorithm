package algorithm.baekjoon;

import java.util.Scanner;

public class CompareNumbers_1330 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = (a>b) ? ">" : ((a<b) ? "<" : "==");
        System.out.println(str);
    }
}
