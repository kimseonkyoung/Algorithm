package algorithm.baekjoon;

import java.util.Scanner;

public class AplusB_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        sc.close();

        int result = 0;

        for (int i = 0; i < n; i++) {
            result += Character.getNumericValue(input.charAt(i));
        }

        System.out.print(result);
    }
}
