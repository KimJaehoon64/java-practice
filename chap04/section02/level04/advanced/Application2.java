package com.jaehoon.chap04.section02.level04.advanced;

import java.util.Scanner;

/* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
 *
 * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
 * 지폐외 동전을 구분하여 단위를 표기하세요
 *
 * -- 입력 예시 --
 * 받으신 금액을 입력하세요 : 100000
 * 상품 가격을 입력하세요 : 22340
 *
 * -- 출력 예시 --
 * ============================
 * 50000원권 지폐 1장
 * 10000원권 지폐 2장
 * 5000원권 지폐 1장
 * 1000원권 지폐 2장
 * 500원권 동전 1개
 * 100원권 동전 1개
 * 50원권 동전 1개
 * 10원권 동전 1개
 * ============================
 * 거스름돈 : 77660원
 * */
public class Application2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("받으신 금액을 입력하세요: ");
        int money = sc.nextInt();
        System.out.println("상품 가격을 입력하세요: ");
        int price = sc.nextInt();

        int change = money - price;
        int currency = 50000;
        boolean isCurrencySwitch = true;

        System.out.println("============");

        while(change > 0){
            int count = change / currency;

            if(count > 0){
                if(currency >= 1000){
                    System.out.println(currency + "원권 지폐" + count + "장");
                } else{
                    System.out.println(currency + "원권 동전" + count + "개");
                }
                change %= currency;
            }
            if(isCurrencySwitch){
                currency /= 5;
            }else{
                currency /= 2;
            }
            isCurrencySwitch =!isCurrencySwitch;
        }
        System.out.println("===========================");
        System.out.println("거스름돈 : " + (money - price) + "원");
    }
}
