package com.jaehoon.chap00.javaStudy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

    public static int count; // 재귀 호출 횟수를 기록할 전역 변수

    // 문자열 s의 부분 문자열 s[l...r]이 팰린드롬인지 검사하는 재귀 함수
    public static int recursion(String s, int l, int r){
        count++; // 재귀 호출 횟수 증가
        if(l >= r) return 1; // 부분 문자열이 0개 또는 1개의 문자만 남으면 팰린드롬
        else if(s.charAt(l) != s.charAt(r)) return 0; // 양 끝 문자가 다르면 팰린드롬이 아님
        else return recursion(s, l+1, r-1); // 양 끝 문자가 같으면 중앙으로 이동하여 계속 검사
    }

    // 문자열 s가 팰린드롬인지 검사하는 함수
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1); // 전체 문자열에 대해 재귀 호출
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine()); // 입력받을 테스트 케이스의 수

        for(int i=0; i<N; i++) {
            count = 0; // 각 테스트 케이스마다 재귀 호출 횟수를 초기화
            sb.append(isPalindrome(bf.readLine()) + " " + count).append('\n'); // 팰린드롬 여부와 호출 횟수를 StringBuilder에 추가
        }
        bf.close(); // BufferedReader 닫기
        System.out.println(sb); // 결과 출력
    }
}
