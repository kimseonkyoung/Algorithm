package algorithm.baekjoon;

import java.util.Scanner;

public class Main_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String result = "";
            String words = "";
            int a = 0;
            a = sc.nextInt();
            words = sc.nextLine();

            for (int j = 0; j < words.length(); j++) {
                char ch;
                ch = words.charAt(j);
                for (int k = 0; k < a; k++) {
                    result += ch;
                }
            }

            System.out.println(result.trim());
        }
    }
}