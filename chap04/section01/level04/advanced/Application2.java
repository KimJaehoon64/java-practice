package com.jaehoon.section01.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("월 급여 입력 : ");
        long salary = in.nextLong();
        System.out.println("매출액 입력 : ");
        long revenue = in.nextLong();

        int bonus = 0;

        if (revenue >= 50000000) {
            bonus = 5;
        } else if (revenue >= 30000000) {
            bonus = 3;
        } else if (revenue >= 10000000) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        long total = (salary + (long) (revenue * (bonus * 0.01))); // bonus가 값이 변한 다음에 total 계산을 해야한다

        System.out.println("매출액 : " + revenue);
        System.out.println("보너스율 : " + bonus + "%" );
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + (long) (revenue * (bonus * 0.01)));
        System.out.println("====================");
        System.out.println("총 급여 : " + total);
    }
}