package com.company;

import java.util.Scanner;

public class Test10809 {

    public static void main(String[] args) {
        String word;

        Scanner sc = new Scanner(System.in);
        System.out.println("영단어 입력");
        word = sc.nextLine();

        for(char i = 97 ; i < 123 ; i++){
            System.out.println(word.indexOf(i));
        }
    }
}

