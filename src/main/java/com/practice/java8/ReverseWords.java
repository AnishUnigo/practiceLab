package com.practice.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {

    public static String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split(" ");

        String result = Stream.of(words)
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        return result;
    }

    public static void main(String[] args) {
        String input = "Hello World from Java";
        String output = reverseWords(input);
        System.out.println(output); // Output: "Java from World Hello"
    }
}
