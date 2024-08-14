package com.jaehoon.chap00.javaStudy.bronze;

import java.util.Scanner;

public class FreshmenAvg {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int avg = 0;
    int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = sum / n;

        int count = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] > avg){
                count++;
            }
        }
        float percent = 0;
        percent = ((float) count / n) * 100;
        System.out.print(String.format("%.3f", percent) + "%");
    }
}
