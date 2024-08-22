package com.jaehoon.chap00.javaStudy.bronze;

import java.util.Scanner;

public class CupHolder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int holder = 0;
        int couple = 0;
        int result = 0;
        String seat = sc.nextLine();
        char[] cup = seat.toCharArray();
        sc.close();

        for (int i = 0; i < n; i++) {
            if (cup[i] == 'S') {
                holder++;
            } else if (cup[i] == 'L') {
                couple++;
            }
        }
        if (couple == 0) {
            result = holder;
        } else {
            result = holder + (couple / 2) + 1;

        }
        System.out.println(result);
    }

}
