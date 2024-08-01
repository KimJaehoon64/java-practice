package com.jaehoon.chap04.section02.level02.normal;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.print("박");
            }else{
                System.out.print("수");
            }
        }
    }
}
