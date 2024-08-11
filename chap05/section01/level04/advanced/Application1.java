package com.jaehoon.chap05.section01.level04.advanced;

import java.util.Arrays;
public class Application1 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < 6; i++) {
                arr[i] = (int) ((Math.random() * 45) + 1);
            }
            for (int i = 0; i < 6; i++) {
                for (int j = i+1; j < 6; j++) {
                    if (arr[i] == arr[j]) {
                        check = true;
                        break;
                    }
                }
                if (check) break;
            }
        }

        Arrays.sort(arr);

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

