package algorithm.baekjoon.refactor;
import java.util.Scanner;

public class Main_2920 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[8];

        for (int i = 0; i < 8; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        boolean isAscending = false;
        boolean isDescending = false;

        for (int i = 0; i< 7; i++) {
            if (numbers[i] < numbers[i + 1]) {
                isAscending = true;
            } else if (numbers[i] > numbers[i + 1]) {
                isDescending = true;
            }
        }

        if (isAscending) {
            System.out.print("ascending");
        } else if (isDescending) {
            System.out.print("descending");
        } else {
            System.out.print("mixed");
        }
    }
}
