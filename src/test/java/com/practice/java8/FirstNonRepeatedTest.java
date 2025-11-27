package com.practice.java8;

import org.junit.jupiter.api.Test;

public class FirstNonRepeatedTest {

    @Test
    void testFindFirstNonRepeatedCharacter(){
        String str = "abcabcbbd";
        var result = FirstNonRepeated.findFirstNonRepeatedCharacter(str);
        assert 'd' == result;
    }
}
