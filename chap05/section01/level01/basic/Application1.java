package com.jaehoon.chap05.section01.level01.basic;
/* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
 * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
 * */
public class Application1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
