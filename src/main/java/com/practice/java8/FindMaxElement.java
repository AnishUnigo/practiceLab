package com.practice.java8;

import java.util.List;

public class FindMaxElement {

    public static Integer findMaxElement(List<Integer> numbers) {
        return numbers.stream()
                .max(Integer::compare)
                .get();

    }
}
