package algorithm.baekjoon;

import java.util.Scanner;

public class Main_2920 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String melody = "";

        for(int i=0;i<8;i++) {
            melody += String.valueOf(sc.nextInt());
        }

        if(melody.equals("12345678")) {
            System.out.print("ascending");
        }else if (melody.equals("87654321")) {
            System.out.print("descending");
        }else {
            System.out.print("mixed");
        }
    }
}