package com.jaehoon.section01.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요: ");
        int kor = in.nextInt();
        System.out.println("영어 점수를 입력하세요: ");
        int eng = in.nextInt();
        System.out.println("수학 점수를 입력하세요: ");
        int mat = in.nextInt();

        int avg = (kor + eng + mat) / 3;
        if (avg >= 60 && kor > 40 && eng > 40 && mat > 40){
            System.out.println("합격입니다!");
        } else {
            System.out.println("평균 점수 미달로 불합격입니다!");
        }
            if (avg < 60 && kor < 40){
            System.out.println("국어 점수 미달로 불합격입니다");
        }
            if (avg < 60 && eng < 40){
            System.out.println("영어 점수 미달로 불합격입니다.");
        }  if(avg < 60 && mat < 40){
            System.out.println("수학 점수 미달로 불합격입니다.");
        }
        }
    }

