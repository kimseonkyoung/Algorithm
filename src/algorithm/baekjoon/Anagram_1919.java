package algorithm.baekjoon;

import java.util.Scanner;

public class Anagram_1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();
        String a2 = sc.nextLine();

        char []ac1 = new char[26];
        char []ac2 = new char[26];

        for(char v : a1.toCharArray()){
            ac1[(int)(v -'a')]++;
        }

        for(char v : a2.toCharArray()){
            ac2[(int)(v -'a')]++;
        }
        int deleteNum = 0;

        for(int i=0;i<26;i++){
            if(ac1[i] != ac2[i]){
                deleteNum += Math.abs(ac1[i] - ac2[i]);
            }
        }
        System.out.println(deleteNum);
    }
}
