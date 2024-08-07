package com.jaehoon.chap00.javaStudy.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Mod {
    public static void main(String[] args) {
        int[] arr = new int[10];  // 정수 입력 받을 배열
        int count = 0;
        boolean same;     // 배열 같은 값 비교

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {  // 입력 후 나머지 저장
            arr[i] = sc.nextInt() % 42;
        }

        for (int j = 0; j < 10; j++) {
            same = true;
            for (int k = j + 1; k < 10; k++) {
                if (arr[j] == arr[k]) {
                    same = false;
                }
            }
            if (same) {
                count++;
            }

        }
        System.out.println(count);
        //System.out.println("각 수를 42로 나눈 나머지는 " + Arrays.toString(arr) + "이다" );
    }
}
