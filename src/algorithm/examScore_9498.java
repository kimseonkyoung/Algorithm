package algorithm;
import java.util.Scanner;

public class examScore_9498 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        sc.close();

        System.out.println((score>=90)? "A": (score>=80)? "B": (score>=70)? "C": (score>=60)? "D": "F");
    }
}
