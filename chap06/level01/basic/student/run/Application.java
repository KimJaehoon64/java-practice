package com.jaehoon.chap06.level01.basic.student.run;

import com.jaehoon.chap06.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] student = new StudentDTO[10];
        int count = 0;

        label:
        while (count < student.length) {
            for (int i = 0; i < 10; i++) {
                Scanner sc = new Scanner(System.in);

                System.out.println("학년 : ");
                int grade = sc.nextInt();

                System.out.println("반 : ");
                int classroom = sc.nextInt();

                System.out.println("이름 : ");
                String name = sc.next();

                System.out.println("국어점수 : ");
                int kor = sc.nextInt();

                System.out.println("영어점수 : ");
                int eng = sc.nextInt();

                System.out.println("수학점수 : ");
                int math = sc.nextInt();

                student[i] = new StudentDTO(grade, classroom, name, kor, eng, math);
                count++;

                System.out.println("계속 추가할 겁니까? : (y || Y) ");
                String str = sc.next();
                if(!(str.equals("y") || str.equals("Y"))) {
                     break label;
                }

            }

        }
        for (int i = 0; i < count; i++) {
            student[i].getInformation();
        }
    }
}
