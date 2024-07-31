package com.jaehoon.level01.basic;

public class Calculator {




    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        int a = 10;
        return ((a * (a + 1)) / 2);
    }

    public void checkMaxNumber(int a, int b){
       int max = (a > b) ? a : b;
       System.out.println("두 수 중 큰 수는 " + max + "이다.");
    }

    public int sumTwoNumber(int a, int b){
        return(a + b);

    }
    public int minusTwoNumber(int c, int d){
        return(c - d);
    }

}
