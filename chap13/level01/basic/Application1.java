package com.jaehoon.chap13.level01.basic;

import java.util.ArrayList;
import java.util.Scanner;

//학생 성적 : 100
//추가 입력하려면 y : y
//학생 성적 : 95
//추가 입력하려면 y : Y
//학생 성적 : 66
//추가 입력하려면 y : y
//학생 성적 : 79
//추가 입력하려면 y : n
//학생 인원 : 4
//평균 점수 : 85.0
public class Application1 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        char ch = 'y';
        int count = 0;
        int sum = 0;
        double avg = 0;

        while (ch == 'y') {
            System.out.print("학생 성적 : ");
            Scanner in = new Scanner(System.in);
            list.add(in.nextInt());
            count++;

            System.out.print("추가 입력하려면 y : ");
            Scanner sc = new Scanner(System.in);
            ch = sc.next().charAt(0);

            if (ch != 'y') {
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sum += (Integer) list.get(i);
        }
        avg = ((double)sum) / list.size();

        System.out.println("학생 인원 : " + count);
        System.out.println("평균 점수 : " + avg);
    }
}

