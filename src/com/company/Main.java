package com.company;

import com.company.structure.MyArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> myArrayList = new MyArrayList();

        String testName = "donghyeon";
        myArrayList.add(testName);
        myArrayList.add(testName);
        myArrayList.add(testName);
        myArrayList.add(testName);

        myArrayList.add(1,"jiseong");


        System.out.print(myArrayList.toString());

        // ==  Memory donghyeon == donghyeon

        // String immutable
        //String 만들 때마다 새로운 주소에 할당이 된다.





    }
}
