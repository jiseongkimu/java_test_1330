package com.company;

import java.util.Scanner;

public class Test10809 {
    private static String[] array_alphabet = array_alphabet = new String[26];

    public static void alphabet_array(){
        String alphabet = "abcdegfhijklnmopqrstuvwxyz";
        array_alphabet = alphabet.split("");
    }

    public static void comapare(String[] a, String[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.println(a[i]+" : "+b[j]);
                if (a[i] == b[j]){
                    b[j] = com;
                }
            }
        }
        for (String bb : b) {
            System.out.println("출력해야할 알파벳 배열 : " + bb);
        }
        for (String aa : a) {
            System.out.println("입력 받은 문자열 배열 : " + aa);
        }
    }


    public static void main(String[] args) {
        String word;
        String[] array_word = new String[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("영단어 입력");
        word = sc.nextLine();

        array_word = word.split("");
        alphabet_array();
        comapare(array_word, array_alphabet);
    }
}

