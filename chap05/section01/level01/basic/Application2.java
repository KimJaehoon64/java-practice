package com.jaehoon.chap05.section01.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        String[] str = {"딸기", "바나나", "복숭이", "카위", "사광"};

        Scanner sc = new Scanner(System.in);
        System.out.println("0부터 4까지의 정수를 입력하세요: " );
        int num = sc.nextInt();

        if(num < 5){
            System.out.println(str[num]);
        }else {
            System.out.println("준비된 과일이 없습니다.");
        }
    }
}
