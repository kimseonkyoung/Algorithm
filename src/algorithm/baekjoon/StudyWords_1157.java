package algorithm.baekjoon;

import java.util.Scanner;

public class StudyWords_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        char [] a = new char[28];

        for(char v : word.toCharArray()){
            a[v-'A']++;
        }
        int index = 0;
        int max = 0;
        int same = 0;

        for(int i=0;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
                index = i;
                same = 0;
            }else if(a[i] == max){
                same++;
            }
        }
        if(same > 0){
            System.out.println("?");
        }else{
            System.out.println(Character.toUpperCase((char)(index+65)));
        }
    }
}
