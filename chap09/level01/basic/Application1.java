package com.jaehoon.chap09.level01.basic;
/* ----- 입력 예시 -----
 *
 * 문자열 입력 : I will be a good developer.
 *
 * ----- 출력 예시 -----
 *
 * 변환된 문자열: I Will Be A Good Developer.
 * 총 단어 개수: 6
 */
/* 사용할 함수 : 소문자 -> 공백 포함 -> 어디부터 어디까지 */
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = s.nextLine();  //I will be a good developer.
        StringBuilder sb = new StringBuilder();

        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
             sb.append(arr[i].substring(0, 1).toUpperCase());  //
             sb.append(arr[i].substring(1));
             sb.append(" ");
        }

        System.out.println("문자열 출력 : " + sb);

        System.out.println("총 단어 개수 : " + arr.length);

    }
}
