package com.practice.java8;

import java.util.List;

public class NumberStartingWithOne {

    public static List<String> filterNumbersStartingWithOne(List<Integer> numbers) {

        return  numbers.stream()
                .map(String::valueOf)
                .filter(str -> str.startsWith("1"))
                .toList();
    }
}
