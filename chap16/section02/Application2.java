package com.jaehoon.chap16.section02;

import java.util.*;
import java.util.stream.Collectors;

public class Application2 {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("O001", "홍길동", Arrays.asList("노트북", "마우스"), 1200.0, "배송 완료"),
                new Order("O002", "김철수", Arrays.asList("스마트폰"), 800.0, "배송 중"),
                new Order("O003", "이영희", Arrays.asList("태블릿", "키보드"), 600.0, "배송 완료"),
                new Order("O004", "박민수", Arrays.asList("모니터"), 300.0, "배송 중")
        );

        // 1. 배송 완료 상태의 주문 ID 리스트를 반환
        List<String> completedOrderIds = orders.stream()
                .filter(order -> "배송 완료".equals(order.getStatus()))
                .map(Order::getOrderId)
                .collect(Collectors.toList());

        System.out.println(completedOrderIds);

        // 2. 각 고객이 주문한 총 금액을 계산하여 맵으로 반환
        Map<String, Double> totalAmountByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName, // 고객별로 그룹화
                        Collectors.summingDouble(Order::getTotalAmount) // 각 고객의 총 주문 금액 계산
                ));

        System.out.println(totalAmountByCustomer);

        // 3. 가장 높은 주문 금액을 가진 고객의 이름을 반환
   String highestOrderCustomer = totalAmountByCustomer.entrySet().stream()
           .max(Map.Entry.comparingByValue()) // 가장 높은 금액 찾기
           .map(Map.Entry::getKey) // 고객 이름
           .get();

        System.out.println(highestOrderCustomer);

    }
}

