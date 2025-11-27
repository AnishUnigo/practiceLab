package com.practice.java8;

import org.junit.jupiter.api.Test;

public class FindFirstElementTest {

    @Test
    void testFindFirstElement() {
        var result = FindFirstElement.findFirstElement(java.util.List.of(5, 10, 15, 20));
        assert result.equals(5);
    }

    @Test
    void testFindTotalNumberOfElements() {
        var result = FindFirstElement.findTotalNumberOfElements(java.util.List.of(5, 10, 15, 20));
        assert result.equals(4);
    }
}
