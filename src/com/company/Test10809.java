package com.company;

import java.util.Scanner;

public class Test10809 {
//      private static String[] array_alphabet = array_alphabet = new String[26];
//
//    public static void alphabet_array(){
//        String alphabet = "abcdegfhijklnmopqrstuvwxyz";
//        array_alphabet = alphabet.split("");
//    }
//
//    public static void comapare(String[] w, String[] a, String word) {
//        for (int i = 0; i < w.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.println("비교 = " + w[i]+" : "+a[j]);
//                if (w[i] == a[j]){
//                }
//            }
//        }
//        for (String bb : a) {
//            System.out.println("출력해야할 알파벳 배열 : " + bb);
//        }
//        for (String aa : w) {
//            System.out.println("입력 받은 문자열 배열 : " + aa);
//        }
//    }


    public static void main(String[] args) {
        String word;
//        String[] array_word = new String[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("영단어 입력");
        word = sc.nextLine();

//        array_word = word.split("");
//        alphabet_array();
//        comapare(array_word, array_alphabet, word);

        for(char i = 97 ; i < 123 ; i++){
            System.out.println(word.indexOf(i));
        }
    }
}

