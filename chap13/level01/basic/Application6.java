package com.jaehoon.chap13.level01.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit') : " );
        String info = sc.nextLine();

        if(info.equals("exit")){
            break;
        }else if(info.equals("search")){
            System.out.println("검색 할 이름 : ");
            String name = sc.nextLine();
            if(map.containsKey(name)){
                System.out.println(name + "씨의 전화번호 : " + map.get(name));
            }else{
                System.out.println(name + "씨의 번호는 등록 되어 있지 않습니다");
            }
        } else {
            String[] text = info.split(" ", 2);
            if(text.length != 2){
                System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요");
            } else{
                String name = text[0];
                String value = text[1];
                map.put(name, value);
                System.out.println("추가 완료 : " + name + " : " + value);
            }
        }
        }
    }
}
