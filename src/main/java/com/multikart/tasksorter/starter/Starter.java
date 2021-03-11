package com.multikart.tasksorter.starter;

import com.multikart.tasksorter.csv.CSV;
import com.multikart.tasksorter.exception.SmthGoneWrongException;
import com.multikart.tasksorter.sorter.Sorter;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Starter {
    public void start(String[] args) {
        String string = "T1008, ,T1004,";
        String[] array = new String[]{"T1008, ,T1004,  ,T1005", "T1008, ,T1004"};

        List<String> list = Sorter.sort(string, array);

        File file = new File(".", "output");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new SmthGoneWrongException(e);
        }
        CSV.writeTasksToFile(list, file);
    }
}
