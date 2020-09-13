package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(sum(num1, num2));
    }
}
