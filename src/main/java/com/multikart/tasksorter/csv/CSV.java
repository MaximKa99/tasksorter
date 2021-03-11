package com.multikart.tasksorter.csv;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import com.multikart.tasksorter.exception.SmthGoneWrongException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSV {
    public static void writeTasksToFile(List<String> tasks, File file) {
        CSVWriter csvWriter;
        try {
            csvWriter = new CSVWriter(new FileWriter(file));
            String[] buff = new String[tasks.size()];
            csvWriter.writeNext(tasks.toArray(buff));
            csvWriter.close();
        } catch (IOException e) {
            throw new SmthGoneWrongException(e);
        }
    }
}
