package com.jaehoon.chap04.section02.level02.normal;
/* 반복문 이용 소문자 a부터 z까지 반복 */
public class Application2 {
    public static void main(String[] args) {
        int a = 96;
        for (int i = 97; i <= 122; i++) {
            a = a + 1;
            System.out.print( (char) a);
        }
    }
}
