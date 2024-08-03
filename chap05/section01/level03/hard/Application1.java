package com.jaehoon.chap05.section01.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요: ");
        int n = in.nextInt();


        if(n % 2 == 1) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            System.arraycopy(arr, 0, arr, (n / 2) + 1, n / 2);


            for (int i = 0; i < (n / 2) + 1; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = (n - 1); i > (n / 2); i--) {
                System.out.print(arr[i] + " ");
            }
        }else {
            System.out.println(" 양수 혹은 홀수만 입력해야 합니다 ");
        }
        }
        }


