package com.multikart.tasksorter.sorter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

class SorterTest {
    @BeforeEach
    public void setup() {
    }

    @Test
    public void OnlyNecessaryInOneDimensionalArray() {
        String[] array = new String[]{"T1005, ,T1004"};

        String string = "T1004, , T1005";

        String[] expected = array;

        AtomicReference<List<String>> ref = new AtomicReference<>();
        Assertions.assertDoesNotThrow(()-> {
            ref.set(Sorter.sort(string, array));
        });

        Assertions.assertArrayEquals(expected, ref.get().toArray());
    }

    @Test
    public void necessaryPlusOneInOneDimensionalArray() {
        String[] array = new String[]{"T1008, ,T1005, ,T1004"};

        String string = "T1004, , T1005";

        String[] expected = array;

        AtomicReference<List<String>> ref = new AtomicReference<>();
        Assertions.assertDoesNotThrow(()-> {
            ref.set(Sorter.sort(string, array));
        });

        Assertions.assertArrayEquals(expected, ref.get().toArray());
    }

    @Test
    public void NotAllNecessaryOneDimensionalArray() {
        String[] array = new String[]{"T1009, ,T1005,"};

        String string = "T1004, , T1005";

        String[] expected = new String[]{};

        AtomicReference<List<String>> ref = new AtomicReference<>();
        Assertions.assertDoesNotThrow(()-> {
            ref.set(Sorter.sort(string, array));
        });

        Assertions.assertArrayEquals(expected, ref.get().toArray());
    }

    @Test
    public void NotNecessaryOneDimensionalArray() {
        String[] array = new String[]{"T1009, ,"};

        String string = "T1004, , T1005";

        String[] expected = new String[]{};

        AtomicReference<List<String>> ref = new AtomicReference<>();
        Assertions.assertDoesNotThrow(()-> {
            ref.set(Sorter.sort(string, array));
        });

        Assertions.assertArrayEquals(expected, ref.get().toArray());
    }
}