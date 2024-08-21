package com.jaehoon.chap00.programmers.level2;

import java.util.ArrayList;
import java.util.Stack;

class FeatureDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {

        Stack<Integer> stack = new Stack<>(); // 기능이 완료되는 날 스택

        // stack을 사용하기 위해 각 기능의 완료 날짜를 계산 (역방향으로)
        for(int i = progresses.length - 1; i >= 0; i--) {
            int progress = progresses[i];
            int speed = speeds[i]; // 하루 작업량
            int day = 0; // 기능이 완료 되기까지 걸리는 일수


            while (true) { //기능이 100이상이 될 때 까지 작업
                progress += speed;
                day++;
                if (progress >= 100) {
                    break;
                }
            }
            stack.push(day);  // 완료된 날짜를 스택에 저장
        }
        ArrayList<Integer> result = new ArrayList<>();

        while(!stack.isEmpty()) {
            int deploy = stack.pop(); //가장 최근에 완료된 기능의 완료 날짜
            int feature = 1; // 현재 배포 날짜에 배포가능한 기능 수

            // 다음 기능들이 이미 완료된 경우
            while(!stack.isEmpty() && stack.peek() <= deploy) {
                stack.pop(); // 기 완성된 기능 제거
                feature++;  // 배포하는 기능수 증가
            }
            result.add(feature);
        }
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}