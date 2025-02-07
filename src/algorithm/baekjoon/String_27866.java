package algorithm.baekjoon;

import java.util.Scanner;

public class String_27866 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();
        for(int j=1;j<=s.length();j++) {
            if(j==i) {
                System.out.print(s.charAt(i-1));
            }
        }
    }
}