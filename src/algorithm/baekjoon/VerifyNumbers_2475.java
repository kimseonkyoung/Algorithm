package algorithm.baekjoon;
import java.util.Scanner;

public class VerifyNumbers_2475 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int [] verificationNums = new int[5];

        for(int i=0;i<verificationNums.length;i++) {
            verificationNums[i] = sc.nextInt();
        }
        int resultsNum = calculatorVerificationNum(verificationNums);
        System.out.print(resultsNum);
    }

    private static int calculatorVerificationNum(int []verificationNums) {
        int resultNum = 0;
        for(int i=0;i<5;i++) {
            resultNum += verificationNums[i]*verificationNums[i];
        }
        return resultNum % 10;
    }
}
