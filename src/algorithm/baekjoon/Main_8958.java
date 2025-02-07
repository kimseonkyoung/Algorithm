package algorithm.baekjoon;
import java.util.Scanner;

public class Main_8958 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int tn = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<tn; i++) {
            String input = sc.nextLine();

            System.out.println(scoreResult(input));
        }
    }

    private static int scoreResult(String input) {
        int totalScore = 0;
        int plusScore = 1;
        for(int i=0; i<input.length();i++) {
            char ans = input.charAt(i);
            if(ans == 'O') {
                totalScore += plusScore;
                plusScore++;
            } else {
                plusScore = 1;
            }
        }
        return totalScore;
    }
}

