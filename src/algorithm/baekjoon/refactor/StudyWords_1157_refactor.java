package algorithm.baekjoon.refactor;

import java.util.Scanner;

public class StudyWords_1157_refactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        int [] count = getAlphabetCount(word);

        int maxCount = -1;
        char maxAlphabet = '?';
        for(int i=0;i<26;i++){
            if(count[i] > maxCount){
                maxCount = count[i];
                maxAlphabet = (char)('A' + i);
            }else if (count[i] == maxCount){
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);

    }
    public static int[] getAlphabetCount(String str){
        int [] count = new int[26];
        for(int i=0;i<str.length(); i++){
            count[str.charAt(i) - 'A']++;
        }
        return count;
    }
}
