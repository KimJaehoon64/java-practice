package com.jaehoon.chap03.level02.normal;

public class RandomMaker {

    public static int randomNumber(int min, int max) {

        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static String randomUpperAlphabet(int length) {

        String alphabet = " ";
        for (int i = 0; i < length; i++) {
            alphabet += (char) ((int) ('A' + Math.random() * 26));
        }
        return alphabet;
    }

    public static String rockPaperScissors() {
        int a = (int) ((Math.random() * 3) + 1);
        String result = (a == 1) ? "주먹" : (a == 2) ? "가위" : "보";
        return result;
    }


    public static String tossCoin() {
        int a = (int) ((Math.random() * 2) + 1);
        String result = (a == 1)? "앞면" : "뒷면" ;
        return result;

    }
}