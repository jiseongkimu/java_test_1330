package com.company.structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayListTest {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = new MyArrayList();

        list.add(5);
        list.add(4);
        list.add(3);

        System.out.print(list);

    }
}
