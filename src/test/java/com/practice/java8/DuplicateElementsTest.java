package com.practice.java8;

import org.junit.jupiter.api.Test;

import java.util.List;

public class DuplicateElementsTest {

    @Test
    void testDuplicateElements() {
        var result = DuplicateElements.findDuplicateElements(List.of(1, 2, 3, 2, 4, 5, 1, 6, 3));
        assert result.equals(List.of(2, 1, 3));
    }

    @Test
    void testDistinctElements() {
        var result = DuplicateElements.findDistinctElements(List.of(1, 2, 3, 2, 4, 5, 1, 6, 3));
        assert result.equals(List.of(1, 2, 3, 4, 5, 6));
    }
}
