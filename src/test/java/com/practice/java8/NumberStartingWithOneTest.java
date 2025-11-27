package com.practice.java8;

import org.junit.jupiter.api.Test;

import java.util.List;

public class NumberStartingWithOneTest {

    @Test
    void testFilterNumbersStartingWithOne() {
        var result = NumberStartingWithOne.filterNumbersStartingWithOne(List.of(10, 23, 145, 67, 189, 2, 1001));
        assert result.equals(List.of("10", "145", "189", "1001"));
    }
}
