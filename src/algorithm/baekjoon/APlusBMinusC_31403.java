package algorithm.baekjoon;
import java.util.Scanner;

public class APlusBMinusC_31403 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        String plusStr = "";
        plusStr += a;
        plusStr += b;
        int e = Integer.parseInt(plusStr);

        System.out.println(a + b - c);
        System.out.println(e - c);
    }

}
