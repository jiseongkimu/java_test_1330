package com.company;

import java.util.Scanner;

public class Main {

    public static int count_word(int blank, String[] noblank_word){
        for(int i = 0; i < noblank_word.length ; i++){
            if(noblank_word[i].equals(" "))
                blank = blank+1;
        }
        return blank+1;
    }

    public static void main(String[] args) {
        int blank = 0;
        String word;
        String[] noblank_word;
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        word = word.trim();
        noblank_word = word.split("");
        System.out.print(count_word(blank, noblank_word));
    }
}
