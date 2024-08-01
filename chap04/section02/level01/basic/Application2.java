package com.jaehoon.chap04.section02.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
                sum += i;
        }
        System.out.println("1부터" + n + "까지의 합: " + sum);
    }
}
