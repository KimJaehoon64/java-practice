package com.jaehoon.chap09.level01.basic;
import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력 : ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        String[] uniqueWords = new String[words.length];

        int[] wordCounts = new int[words.length];
        int uniqueIndex = 0;

        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");

            if(!word.isEmpty()){
                boolean found = false;
                for (int i = 0; i < uniqueIndex; i++){
                    if(uniqueWords[i].equals(word)){
                        wordCounts[i]++;
                        found = true;
                        break;
                    }
                }
                if(!found){
                    uniqueWords[uniqueIndex] = word;
                    wordCounts[uniqueIndex] = 1;
                    uniqueIndex++;
                }
            }
        }
        String mostFrequentWord = null;
        int maxCount = 0;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < uniqueIndex; i++) {
            result.append(uniqueWords[i]).append(": ").append(wordCounts[i]).append("\n");

            if (wordCounts[i] > maxCount) {
                maxCount = wordCounts[i];
                mostFrequentWord = uniqueWords[i];
            }
        }

        System.out.println("Arrays.toString(words) : " + Arrays.toString(words));
        System.out.println("Arrays.toString(uniqueWords) : " + Arrays.toString(uniqueWords));
        System.out.println("Arrays.toString(wordCounts) : " + Arrays.toString(wordCounts));

        System.out.println("===== 단어 빈도 =====");
        System.out.println(result);
        System.out.println("가장 빈도 높은 단어 : " + mostFrequentWord + " (" + maxCount + " 번)");


    }
}
