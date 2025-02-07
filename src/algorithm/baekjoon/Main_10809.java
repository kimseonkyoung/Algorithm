package algorithm.baekjoon;
import java.util.Scanner;

public class Main_10809 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int [] alp = new int[26];
        for(int i=0; i<alp.length; i++) {
            alp[i] = -1;
        }
        String input = sc.nextLine();

        for(int i=0; i<input.length(); i++) {
            if(alp[input.charAt(i)-97] == -1) {
                alp[input.charAt(i)-97] = i;
            }
        }
        for(int i=0; i<alp.length; i++) {
            System.out.print(alp[i] + " ");
        }
    }
}
