package com.jaehoon.chap13.level01.basic;

import java.util.Scanner;
import java.util.Stack;

// 사용자가 방문한 웹사이트 url 입력받아 저장 가장 최근에 방문한 5개 url출력
// LIFO 사용 : Stack 사용
public class Application2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String input;

        // 프로그램을 계속 실행하기 위한 루프
        while (true) {
            System.out.print("방문 URL을 입력하세요 (종료하려면 'exit' 입력) : ");
            input = sc.nextLine();

            // 'exit' 입력 시 종료
            if (input.equals("exit")) {
                break;
            }

            // URL을 스택에 저장
            stack.push(input);

            // 최근 방문한 5개의 URL 출력
            System.out.println("최근 방문한 URL (최신 5개):");
            printRecentUrls(stack);
            System.out.println("현재 진짜 스택 = " + stack);
        }

        sc.close(); // Scanner 닫기
    }

    // 최근 방문한 URL을 출력하는 메서드
    private static void printRecentUrls(Stack<String> stack) {
        // 복사본 스택을 생성하여 원본 스택을 보존
        Stack<String> tempStack = new Stack<>();

        // 원본 스택의 요소를 복사하여 임시 스택에 저장
        for (int i = 0; i < 5; i++) {
            if (stack.isEmpty()) {
                break;
            }
            String str = stack.pop();
            System.out.println(str);
            tempStack.push(str);
        }

        // 최근 방문한 URL을 출력 (최신 5개)
        int count = 0;
        while (!tempStack.isEmpty() && count < 5) {
            String temp = tempStack.pop();
            stack.push(temp);
            count++;
        }
    }
}