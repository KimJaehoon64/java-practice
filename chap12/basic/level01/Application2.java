package com.jaehoon.chap12.basic.level01;

public class Application2 {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + sum(doubleArray));

         String[] strArray = {"A", "B", "C"};
        // System.out.println("String 합계 : " + sum(strArray));
        // 컴파일 에러 발생: String 타입은 Number의 하위 타입이 아님
        // sum에서 사용 못ㅎㅏㅁ

    }

    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        // 일반적인 for문을 사용하여 배열의 요소를 순회
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue(); // Number 타입의 doubleValue 메서드를 사용하여 합계 계산
        }
        return sum;
    }
}