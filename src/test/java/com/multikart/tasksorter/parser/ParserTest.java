package com.multikart.tasksorter.parser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

class ParserTest {
    private static final String SingleTask = "T1001";
    private static final String twoTasks = "T1001, T2002";
    private static final String hardTwoTasks = "  ,, ,, , , ,,  ,  T1001, , , , ,T2002   ,,,,,";
    private static final String threeTasks = "T1001, T2002, T3003";
    private static final String hardThreeTasks = "  ,, ,, , , ,,  ,  T1001, , , , ,T2002   ,,,,T3003,";
    private static final String hardSingleTask = "  ,, ,, , , ,,  ,  T1001, , , , ,   ,,,,,";

    @Test
    public void parseSingleTask() {
        AtomicReference<String[]> ref = new AtomicReference<>();
        Assertions.assertDoesNotThrow(()->{
            ref.set(Parser.parseString(SingleTask));
        });

        String[] expected = new String[]{"T1001"};

        Assertions.assertArrayEquals(expected, ref.get());
    }

    @Test
    public void parseHardSingleTask() {
        AtomicReference<String[]> ref = new AtomicReference<>();
        Assertions.assertDoesNotThrow(()->{
            ref.set(Parser.parseString(hardSingleTask));
        });

        String[] expected = new String[]{"T1001"};

        Assertions.assertArrayEquals(expected, ref.get());
    }

    @Test
    public void parseTwoTasks() {
        AtomicReference<String[]> ref = new AtomicReference<>();
        Assertions.assertDoesNotThrow(()->{
            ref.set(Parser.parseString(twoTasks));
        });

        String[] expected = new String[]{"T1001", "T2002"};

        Assertions.assertArrayEquals(expected, ref.get());
    }

    @Test
    public void parseHardTwoTasks() {
        AtomicReference<String[]> ref = new AtomicReference<>();
        Assertions.assertDoesNotThrow(()->{
            ref.set(Parser.parseString(hardTwoTasks));
        });

        String[] expected = new String[]{"T1001", "T2002"};

        Assertions.assertArrayEquals(expected, ref.get());
    }

    @Test
    public void parseThreeTasks() {
        AtomicReference<String[]> ref = new AtomicReference<>();
        Assertions.assertDoesNotThrow(()->{
            ref.set(Parser.parseString(threeTasks));
        });

        String[] expected = new String[]{"T1001", "T2002", "T3003"};

        Assertions.assertArrayEquals(expected, ref.get());
    }

    @Test
    public void parseHardThreeTasks() {
        AtomicReference<String[]> ref = new AtomicReference<>();
        Assertions.assertDoesNotThrow(()->{
            ref.set(Parser.parseString(hardThreeTasks));
        });

        String[] expected = new String[]{"T1001", "T2002", "T3003"};

        Assertions.assertArrayEquals(expected, ref.get());
    }
}