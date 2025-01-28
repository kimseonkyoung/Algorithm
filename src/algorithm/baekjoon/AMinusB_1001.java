package algorithm.baekjoon;

import java.util.Scanner;

public class AMinusB_1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calculateMinus(a , b));
    }
    private static int calculateMinus(int a, int b) {
        return a - b;
    }
}
