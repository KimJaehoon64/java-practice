package com.jaehoon.chap00.programmers.level1;

import java.util.LinkedList;

public class Parentheses {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                count++;
            else
                count--;
            if(count < 0) break;
        }
        answer = count != 0 ? false : true;
        return answer;
    }
}
// -- 73점 짜리 : /* 4번 케이스 보고 100점이 아닌 이유 ?  '(' ')' 갯수가 같아야 함 * /
//public class Parentheses {
//    boolean solution(String s) {
//        boolean answer = true;
//        char[] arr = s.toCharArray();
//
//        if (arr[0] == '(' && arr[arr.length - 1] == ')') {
//            answer = true;
//        } else {
//            answer = false;
//        }
//        return answer;
//    }
//}
// -- 92.3점 : 괄호의 갯수를 같게 비교
//int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == '(') {
//count++;
//        }else if (arr[i] == ')'){
//count--;
//        }
//        }