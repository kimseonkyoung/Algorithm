package algorithm.baekjoon;
import java.util.Scanner;

public class acmHotel_10250 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int floor = 0;
        int number = 0;


        for(int i=0;i<t;i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            if( n % h == 0) {
                floor = n;
            } else {
                floor = n % h;
            }
            number = n / h + 1;

            System.out.println((floor*100) + number);
        }
    }
}
