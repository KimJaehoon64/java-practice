package com.jaehoon.level01.basic;

public class Application {
    public static void main(String[] args) {
    int a = 10;
    int b = 20;


    Calculator calc = new Calculator();

    int sum = calc.sum1to10();
    int sum1 = calc.sumTwoNumber(a, b);
    int minus = calc.minusTwoNumber(10, 5);

    calc.checkMethod();
    System.out.println("1부터 10까지의 합 : " + sum);
    calc.checkMaxNumber(a, b);
    System.out.println("10과 20의 합은 : " + sum1);
    System.out.println("10과 5의 차는 : " + minus);

    }
}
