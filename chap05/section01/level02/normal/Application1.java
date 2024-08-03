package com.jaehoon.chap05.section01.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요: ");
        String str = in.nextLine();
        System.out.println("검색할 문자를 입력하세요: ");
        char ch = in.next().charAt(0);

        char[] charArr = str.toCharArray();

        int sum = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ch) {
                sum = sum + 1;
            }
        }
        System.out.println("입력하신 문자열" + str + "에서 찾으시는 문자" + ch + "은" + sum + "개 입니다.");
    }
}
