package com.jaehoon.chap05.section01.level02.normal;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요: ");
        String str = in.nextLine();

        char[] ch = str.toCharArray();

        char[] arr = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            arr[i] = '*';
        }
        System.arraycopy(ch, 0, arr, 0, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
