package com.company;

import java.util.Scanner;

public class Main {

    private static int[] creatArray(int length, int[] array, Scanner sc){
        for(int i = 0 ; i < length ; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static void swap(int[] array, int i){
        int temp = array[i + 1];
        array[i + 1] = array[i];
        array[i] = temp;
    }

    private static void bubbleSortArray(int length, int[] array){
        for(int j = 0 ; j < length ; j++){
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i);
                }
            }
        }
    }

    private static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        int length = array.length;
        Scanner sc = new Scanner(System.in);

        array = creatArray(length, array, sc);
        bubbleSortArray(length, array);
        printArray(array);
    }
}
