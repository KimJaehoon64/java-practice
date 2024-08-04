package com.jaehoon.chap00.javaStudy.bronze;

import java.util.Scanner;

public class changeMoney{
    public static void main(String[] args) {
        int[] arr = {500, 100, 50, 10, 5, 1};  // 잔돈 종류
        int[] count = new int[arr.length]; // 잔돈의 갯수 배열

        Scanner in = new Scanner(System.in);
       // System.out.println("상품가격을 입력하세요: ");
        int price = in.nextInt();
        int result = 1000 - price;  // 총 잔돈
        int counting = 0;     // 잔돈 갯수

        while (result != 0) {
            for (int i = 0; i < arr.length; i++) {
                count[i] = result / arr[i];
                counting += count[i];
                result = result % arr[i];
            }
            System.out.println(counting);
        }
       /* for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "의 개수는 : " + count[i] );
        } */
    }
}
