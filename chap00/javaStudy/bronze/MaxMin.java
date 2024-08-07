package com.jaehoon.chap00.javaStudy.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // n을 입력받는다
        int[] arr = new int[n];  // 배열을 생성

        for (int i = 0; i < n; i++) {  // 배열마다 정수 값 저장
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 오름차순 정렬
        System.out.println(arr[0] + " " + arr[n - 1]);
    }
}