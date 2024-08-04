package com.jaehoon.chap05.section02.level03.hard;

import java.util.Scanner;

public class Appliction1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("가로 행의 수를 입력하세요 : ");
        int row = in.nextInt();
        System.out.print("세로 열의 수를 입력하세요 : ");
        int col = in.nextInt();

        char [][] arr = new char[row][col];

        if ((row >= 1 && row <= 10) && (col >= 1 && col <= 10)){
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    arr[i][j] = (char) (Math.random() * 26 + 65);
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(" ");
        }
        }else {
            System.out.println("반드시 1~10까지의 정수를 입력하세요");
        }
    }
}
