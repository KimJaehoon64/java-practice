package com.jaehoon.chap00.programmers.level1;


import java.util.HashMap;

class PlayerCalling {
    public String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i); // player랑 인덱스 map에 저장 시킨다
        }

        for (String calling : callings) {
            int call = map.get(calling); // 호출된 플레이어의 현재 인덱스 찾기

            if (call > 0) {
                String temp = players[call - 1];
                players[call - 1] = players[call];
                players[call] = temp;

                // 새롭게 map을 업데이트
                map.put(players[call - 1], call - 1);
                map.put(players[call], call);


            }
        }
        return players;
    }
}