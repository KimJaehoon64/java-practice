package com.jaehoon.chap00.programmers.level1;

import java.util.Scanner;

//문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
//각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
//각 단어의 짝수번째 알파벳은 대문자로,
//홀수번째 알파벳은 소문자로 바꾼 문자열을
//리턴하는 함수, solution을 완성하세요.
public class WeirdText {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // "try hello world" 입력
        int index = 0;
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(" "); // 공백단위로 문자열 저장

        for(int i = 0; i < arr.length; i++) {
            String s = arr[i];
            for (int j = 0; j < arr[i].length(); j++) {
                char ch = s.charAt(j);
                if(j % 2 == 0) {
                    sb.append(Character.toUpperCase(ch));  //char타입에는 toUpperCase메소드가 없다
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
            }
             sb.append(" ");
        }
        System.out.print(sb);
    }
}
