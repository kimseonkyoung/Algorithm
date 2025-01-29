package algorithm.baekjoon;
import java.util.Scanner;

public class NumberLessThan {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int [] numbers = new int[N];

        for(int i=0;i<numbers.length;i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++) {
            if(numbers[i] < X) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
