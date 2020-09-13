package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static int count(int c, String[] a){
        for(int i = 0; i < a.length ; i++){
            if(a[i].equals(" ")){
                c=c+1;
            }
        }
        return c+1;
    }

    public static void main(String[] args) {
        int count = 0;
        String word;
        String[] noblank;
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        word = word.trim();
        noblank = word.split("");
        System.out.println(count(count, noblank));
    }
}
