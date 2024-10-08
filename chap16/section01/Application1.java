package com.jaehoon.chap16.section01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application1 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("홍길동", 25, "IT", 6000),
                new Employee("김철수", 28, "HR", 3000),
                new Employee("이영희", 30, "IT", 7000),
                new Employee("박민수", 22, "영업", 4000),
                new Employee("최지현", 35, "HR", 3500),
                new Employee("한석봉", 40, "IT", 5000)
        );
        // 1. 모든 직원의 이름을 쉼표로 구분된 문자열로 반환
        String allNames = employees.stream()
                .map(Employee::getName)  // Employee에서 이름 얻기
                .collect(Collectors.joining(", "));  // 쉼표 추가 문자열로 결합

        System.out.println(allNames);

        // 2. IT 부서에서 급여가 5,000 이상인 직원의 이름을 급여 순으로 내림차순 정렬하여 반환
        List<String> highSalaryIT  = employees.stream()
                .filter(dept -> "IT".equals(dept.getDepartment()) && dept.getSalary() >= 5000)
                .sorted((d1, d2) -> Integer.compare(d2.getSalary(), d1.getSalary()))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(highSalaryIT);

        // 3. 각 부서별 평균 급여를 계산하여 맵으로 반환
        Map<String, Double> averageSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, // 부서별로 그룹화
                        Collectors.averagingDouble(Employee::getSalary) // 평균 계산
                ));

        System.out.println(averageSalaryByDept); // 결과 출력
    }

    }
