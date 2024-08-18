package com.jaehoon.chap00.javaStudy.bronze;

import java.util.Scanner;
// 컴파일 에러 n 번
//public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if (n < 0 || n > 20) {
//            return;
//        }
//
//        if (n == 0) {
//            System.out.println(0);
//            return;
//        } else if (n == 1) {
//            System.out.println(1);
//            return;
//        }
//
//        int a = 0;
//        int b = 1;
//        int sum = 0;
//
//        for (int i = 2; i <= n; i++) {
//            sum = a + b;
//            a = b;
//            b = sum;
//        }
//
//        System.out.println(sum);
//    }
//}

// 정답
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0 || n > 20) {
            return;
        }

        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        if (n > 0) {
            fibo[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        System.out.println(fibo[n]);
    }
}