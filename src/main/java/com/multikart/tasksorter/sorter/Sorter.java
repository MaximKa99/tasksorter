package com.multikart.tasksorter.sorter;

import com.multikart.tasksorter.parser.Parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public static List<String> sort(String string, String[] array) {
        List<String> list = new ArrayList<>();

        String[] necessaryTask = Parser.parseString(string);

        for (String arrElem : array) {
            String[] parsedArrElem = Parser.parseString(arrElem);
            if (checkNecessaryTasks(necessaryTask, parsedArrElem)) {
                list.add(arrElem);
            }
        }

        return list;
    }

    private static boolean checkNecessaryTasks(String[] necessaryTasks, String[] tasks) {
        for (String necessaryTask : necessaryTasks) {
            boolean existence = false;
            for (String task : tasks) {
                if (task.equals(necessaryTask)) {
                    existence = true;
                    break ;
                }
            }
            if (existence == false) {
                return false;
            }
        }
        return true;
    }
}
