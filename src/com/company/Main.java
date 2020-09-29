package com.company;

public class Main {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        System.out.print("str1==str2 : ");
        System.out.println(str1==str2);
        System.out.println(""+str1==str2); // 앞에 "" 만 넣었는데 왜 결과가 flase가 될까

        System.out.print("str1.equals(str2) : ");
        System.out.println(str1.equals(str2));

        System.out.print("str1==str3 : ");
        System.out.println(str1==str3);

        System.out.print("str1.equals.(str3) : ");
        System.out.println(str1.equals(str3));

        str3 = str3.intern();
        System.out.print("after str3.inter() str1==str3 : ");
        System.out.println(str1==str3);
    }
}
