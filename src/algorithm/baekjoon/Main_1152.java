package algorithm.baekjoon;
import java.util.Scanner;

public class Main_1152 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String words = sc.nextLine();
        int space = 0;
        int sideSpaceChk = 0;

        if(words.charAt(0) == 32) {
            sideSpaceChk++;
        }
        if(words.charAt(words.length()-1) == 32) {
            sideSpaceChk++;
        }
        for(int i=0;i<words.length();i++) {
            char c = words.charAt(i);
            if((int)c == 32) {
                space++;
            }
        }
        if (sideSpaceChk == 2) {
            System.out.print(space - 1);
        }else if(sideSpaceChk == 1) {
            System.out.print(space);
        }else {
            System.out.print(space + 1);
        }
    }
}