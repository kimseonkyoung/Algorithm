package algorithm.baekjoon;
import java.util.Scanner;

public class Main_2577 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int abc = 1;

        for(int i=0;i<3;i++) {
            abc *= sc.nextInt();
        }

        String abcConvertStr = String.valueOf(abc);
        int []countAbc = new int[10];

        for(int i=0;i<abcConvertStr.length();i++) {
            int a = Integer.parseInt(abcConvertStr.substring(i,i+1));
            countAbc[a]++;
        }
        for(int i=0;i<countAbc.length;i++) {
            System.out.println(countAbc[i]);
        }

    }
}
