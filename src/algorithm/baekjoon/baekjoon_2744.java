package algorithm.baekjoon;


import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class baekjoon_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String character= sc.nextLine();
        char [] convertUpLo = character.toCharArray();

        for(int i=0;i<convertUpLo.length;i++){
            if(isUpperCase(convertUpLo[i])){
                convertUpLo[i] = (char) (convertUpLo[i] + 32);
            }else{
                convertUpLo[i] = (char) (convertUpLo[i] - 32);
            }
        }
        character = new String(convertUpLo);
        System.out.println(character);
    }
}
