package com.jaehoon.chap04.section02.level01.basic;

import java.util.Scanner;
/* 1부터 입력 받은 정수까지의 짝수의 합 */
public class Application3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int n = in.nextInt();
        int sum = 0;


        for(int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1부터" + n + "까지 짝수의 합: " + sum);
      }
   }

