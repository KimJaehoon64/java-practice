package com.jaehoon.chap04.section02.level01.basic;

public class Application1 {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1 ; i <=10 ; i++){
            sum = sum + i;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }
}
