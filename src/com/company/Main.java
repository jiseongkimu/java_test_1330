package com.company;

import java.util.Scanner;

public class Main {

    private static int[] creatArray(int length, int[] array, Scanner sc){
        for(int i = 0 ; i < length ; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int[] bubbleSortArray(int length, int[] array, int temp){
        for(int j = 0 ; j < length ; j++){
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    //length--;
                }
            }
        }
        return array;
    }

    private static void printArray(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        int temp = 0, length = array.length;
        Scanner sc = new Scanner(System.in);

        array = creatArray(length, array, sc);
        bubbleSortArray(length, array, temp);
        printArray(array);
    }
}
