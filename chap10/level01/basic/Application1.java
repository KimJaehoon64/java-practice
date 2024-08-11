package com.jaehoon.chap10.level01.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 두 개 정수를 입력 받아 나눗셈을 수행한다
* 정수가 아닌값을 경우 / 나누는 수가 0일경우 exception 각각 처리 */
public class Application1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("분자 입력 : ");
            int num1 = sc.nextInt();
            System.out.print("분모 입력 : ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("결과 : " + result);
          } catch (InputMismatchException e){
            System.out.println("오류 : 유효한 정수를 입력하세요" );
        } catch(ArithmeticException e){
            System.out.println("오류 : 0으로 나누는 것은 허용 되지 않습니다" );
        } finally {
            System.out.println("실행이 완료되었습니다.");
        }

    }
}
