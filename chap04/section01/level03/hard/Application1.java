package com.jaehoon.section01.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int first = in.nextInt();
        System.out.println("두 번째 정수 : ");
        int second = in.nextInt();
        System.out.println("연산 기호를 입력하세요 : ");
        char op = in.next().charAt(0);

        int result = 0;


        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다");
                ;
        }
        if (result != 0) {
            System.out.println(first + " " + op + " " + second + " = " + result);
        }
    }
}