package com.practice.java8;

import java.util.List;

public class FindFirstElement {

    public static Integer findFirstElement(List<Integer> numbers) {
        return numbers.stream()
                .findFirst()
                .orElse(null);

    }

    public static Integer findTotalNumberOfElements(List<Integer> numbers) {
        return (int) numbers.stream()
                .count();
    }
}
