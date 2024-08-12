package com.jaehoon.chap13.level01.basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// 학생 ID 관리 : 이미존재하면 ID 추가하지 않음
public class Application4 {
    public static void main(String[] args) {
        Set <String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료 : ) ");
            String id = sc.nextLine();
            if (id.equals("exit")) {
                System.out.println("모든 학생의 ID : " + set);
                break;
            }
            if (set.contains(id)) {
                System.out.println("이미 등록된 ID 입니다: ");
            } else {
                set.add(id);
                System.out.println("ID가 추가 되었습니다");
            }
        }

    }
}
