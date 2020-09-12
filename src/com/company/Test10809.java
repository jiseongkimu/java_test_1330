package com.company;

import java.util.Scanner;

public class Test10809 {

    public static void main(String[] args) {
        String word;

        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();

        for(char i = 97 ; i < 123 ; i++){
            System.out.print(word.indexOf(i) + " ");
        }
    }
}

