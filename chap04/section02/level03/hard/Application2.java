package com.jaehoon.chap04.section02.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;

        Scanner a = new Scanner(System.in);
        int att = 0; // 시도 횟수
        int input = 0;  // 사용자 입룍

        while (true){
        System.out.println("정수를 입력하세요: ");
        input = a.nextInt();
        att++;

        if(input < randomNum){
            System.out.println("입력하신 정수보다 큽니다");
        }else if (input > randomNum){
            System.out.println("입력하신 정수보다 작습니다");
        }else {
            System.out.println("정답입니다" + att + "회 만에 정답을 맞추었습니다");
            break;
        }
        }
    }
}
