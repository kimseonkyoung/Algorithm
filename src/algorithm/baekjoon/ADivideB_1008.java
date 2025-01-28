package algorithm.baekjoon;

import java.util.Scanner;

public class ADivideB_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(calculateDivision(a, b));
    }
    private static double calculateDivision(double a, double b) {
        return a / b;
    }
}
