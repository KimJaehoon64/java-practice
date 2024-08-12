package com.jaehoon.chap13.level01.basic;

import java.util.Scanner;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("단어('exit' 입력 시 종료 : ) ");
            String text = sc.nextLine();

            if(text.equals("exit")){
                System.out.println("정렬 된 단어 : " + set);
                break;
            }else {
                set.add(text);
            }
        }
    }
}
