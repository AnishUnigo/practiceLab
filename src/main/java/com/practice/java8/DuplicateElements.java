package com.practice.java8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

    public static List<Integer> findDuplicateElements(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        return numbers.stream()
                .filter(n -> !seen.add(n))
                .toList();
    }

    public static List<Integer> findDistinctElements(List<Integer> numbers) {

        return numbers.stream()
                .distinct()
                .toList();
    }

}
