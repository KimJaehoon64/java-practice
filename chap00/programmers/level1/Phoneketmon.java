package com.jaehoon.chap00.programmers.level1;

import java.util.HashSet;
import java.util.Set;

import static javax.swing.text.html.HTML.Attribute.N;

public class Phoneketmon {
        public int solution(int[] nums) {
            // 배열의 길이
            int N = nums.length;
            int answer;

            // 배열을 Set으로 변환하여 중복을 제거
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }

            // Set의 크기, 즉 고유한 값의 개수
            int K = set.size();

            // N/2와 K 중 작은 값을 반환
            if (N / 2 >= K) {
                answer = K;
            } else {
                answer = N / 2;
            }
            return answer;
        }
    }
