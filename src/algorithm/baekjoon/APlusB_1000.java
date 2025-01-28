package algorithm.baekjoon;

import java.util.Scanner;

public class APlusB_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateSum(a, b));
    }
    private static int calculateSum(int a, int b) {
        return a + b;
    }
}
