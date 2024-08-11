package com.jaehoon.chap00.programmers.level1;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" "); // 공백 단위로 단어를 분리

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (count % 2 == 0) {
                    sb.append(Character.toUpperCase(ch)); // 짝수 인덱스는 대문자
                } else {
                    sb.append(Character.toLowerCase(ch)); // 홀수 인덱스는 소문자
                }
                count++;
            }
            if (i < words.length - 1) {
                sb.append(" "); // 마지막 단어가 아닌 경우 공백 추가
            }
        }

        return sb.toString(); // 최종 결과 반환
    }
}
