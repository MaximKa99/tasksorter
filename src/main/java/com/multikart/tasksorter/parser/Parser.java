package com.multikart.tasksorter.parser;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Parser {
    public static String[] parseString(String string) {
        String[] result = string.split("[\\,\\s]+");
        string = Arrays.stream(result).collect(Collectors.joining(" ")).trim();
        return string.split(" ");
    }
}
