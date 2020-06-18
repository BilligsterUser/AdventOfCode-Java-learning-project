package org.haffson.adventofcode.utils;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * File readers to load and parse input files for the puzzles.
 */
@Component
public class FileReaders {
    //TODO read file as string
    //TODO parse ints separated by '\n','\r\n' or ','
    public String readFile(String fileName) {
        // if (!Files.exists(Paths.get(fileName))){return "";}
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public Integer[] readFileAsIntArr(String fileName) {
        return strToIntArr(readFile(fileName));
    }

    public Integer[] strToIntArr(String str) {
        if (str.length() == 0) {
            return new Integer[0];
        }
        if (str.contains("\r\n")) {
            str = str.replace("\r\n", ",");
        }
        if (str.contains("\n")) {
            str = str.replace("\n", ",");
        }
        String[] strArr = str.split(",");
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            intList.add(Integer.parseInt(strArr[i]));
        }
        return intList.toArray(new Integer[0]);
    }

    public String[] readFileAsStrArr(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8).toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String[0];
    }
}
