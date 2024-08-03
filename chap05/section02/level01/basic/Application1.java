package com.jaehoon.chap05.section02.level01.basic;

public class Application1 {
    public static void main(String[] args) {

        int arr[][] = new int[3][4];
        int value = 1;

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}