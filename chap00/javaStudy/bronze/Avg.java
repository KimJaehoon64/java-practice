package com.jaehoon.chap00.javaStudy.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int max = arr[n - 1];
        double sum = 0;
        double avg = 0;
        double arr2[] = new double[n];
        for (int i = 0; i < arr.length - 1; i++) {
            arr2[i] =  (((double)arr[i] / arr[n-1]) * 100);
            sum += arr2[i];
        }
       arr2[n-1] = 100;
       avg = (double) (sum + 100) / n;

      System.out.println(avg);
       // System.out.print(Arrays.toString(arr2));
    }
}
