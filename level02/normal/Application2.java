package com.jaehoon.level02.normal;

public class Application2 {
    public static void main(String[] args) {
        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        double a, b, c;
        a = korean;
        b = math;
        c = english;

        System.out.println("총점 : " + (int) (a + b + c));
        System.out.println("평균 : " + (int) ((a + b + c) / 3));
    }
}
