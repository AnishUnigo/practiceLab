package com.practice.java8;

import java.util.LinkedHashMap;
import java.util.Map;


public class FirstNonRepeated {

    public static char findFirstNonRepeatedCharacter(String str){

        char[] chars = str.toCharArray();
        char firstNonRepeatedChar=' ';
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for(char ch : chars){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+ 1);
            }else{
                charMap.put(ch, 1);
            }
        }
        return charMap.entrySet()
                .stream()
                .filter((v -> v.getValue() == 1))
                .findFirst()
                .orElseThrow()
                .getKey();

    }
}
