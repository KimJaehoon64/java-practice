package com.jaehoon.chap04.section02.level01.basic;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = in.nextLine(); // 입력받은 문자열 대입
        char ch = str.charAt(0);
        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            System.out.println(i + ":" + ch );
        }
    }
}
