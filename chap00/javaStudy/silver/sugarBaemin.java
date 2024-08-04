package com.jaehoon.chap00.javaStudy.silver;

import java.util.Scanner;
// 설탕 봉지 3키로 5키로 적은 봉지로 배달 떨어지지 않는 경우 -1 출력
public class sugarBaemin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int count = 0;

        while(sugar > 0) {
            if(sugar % 5 == 0) {  // 5kg 봉지를 최대한 사용하면 적은 봉지 수
                count += sugar / 5;
                System.out.println(count);
                return;  // return 만나면 메서드 종료
            }if(sugar < 3) {
                System.out.println(-1);
                return;
            } else
                sugar -= 3;
            count++;
        }
        System.out.println(count);
    }
}

/* 배운점 : return은 메서드, 루프 동시 종료
*           break는 루프 종료
*
* return은  */
/* 6같은 경우 5로 나누어 버리면 3kg 2봉지를 사용못함
5의 배수가 아니므로 pass 3을 빼주고 count 추가
* */