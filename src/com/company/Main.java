package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static String Compareto(int a, int b){
        if(a>b)
            return ">";
        if(a==b)
            return "==";
        if(a<b)
            return "<";
        return "없음";
    }

    public static void main(String[] args) {

        int intput1, intput2, limit;
        limit = 10000;

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("비교 할 두 수를 입력하세요(종료 : 0 0 )");
            System.out.println("(제한 : -10,000 ≤ A, B ≤ 10,000)");
            intput1 = sc.nextInt();
            intput2 = sc.nextInt();

            if(intput1==0 && intput2==0) {
                System.out.println("종료합니다");
                break;
            }

            if (-limit > intput1) {
                System.out.println("첫 번째 수는 " + -limit + "보다 커야합니다.");
                break;
            }
            if (intput2 > limit) {
                System.out.println("두 번째 수는 " + limit + "보다 작아야합니다.");
                break;
            }
            Compareto(intput1, intput2);
        }
    }
}
