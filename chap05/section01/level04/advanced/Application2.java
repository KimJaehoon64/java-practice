package com.jaehoon.chap05.section01.level04.advanced;

public class Application2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        int value = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value++;
            }
        }

    }
}
