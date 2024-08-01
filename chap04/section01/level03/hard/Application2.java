package com.jaehoon.section01.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("과일 이름을 입력하세요 : ");
        String fruit = in.nextLine();

        int price = 0;

        switch (fruit) {
            case "사과":
                price = 1000;
                break;
            case "바나나":
                price = 3000;
                break;
            case "복숭아":
                price = 2000;
                break;
            case "키위":
                price = 5000;
                break;
            default:
                System.out.println("준비된 상품이 없습니다");
        }
        if (price != 0) {
            System.out.println(fruit + "의 가격은 " + price + "입니다.");
        }
    }
}


