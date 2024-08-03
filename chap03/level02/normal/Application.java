package com.jaehoon.chap03.level02.normal;

import com.jaehoon.chap03.level01.basic.Calculator;

public class Application {
    public static void main(String[] args){
        Calculator clac = new Calculator();

        System.out.println(RandomMaker.randomNumber(10, 25));
        System.out.println(RandomMaker.randomUpperAlphabet(10));
        System.out.println(RandomMaker.rockPaperScissors());
        System.out.println(RandomMaker.tossCoin());
    }
}
