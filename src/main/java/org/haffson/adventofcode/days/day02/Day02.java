package org.haffson.adventofcode.days.day02;

import org.haffson.adventofcode.ProblemStatusEnum;
import org.haffson.adventofcode.days.Days;
import org.haffson.adventofcode.utils.FileReaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Implementation for <i>Day 1: Chronal Calibration</i>.
 */
@Component
public class Day02 implements Days {

    /**
     * The puzzle status {@code HashMap}
     */
    private final HashMap<String, ProblemStatusEnum> problemStatus;
    /**
     * The ids {@code Integer[]}
     */
    private final String[] ids;

    /**
     * Causes the input file to be parsed into the ids array ({@code ids}).
     *
     * @param fileReaders {@code @Autowired} fileReader //TODO: inject what you need
     */
    @Autowired
    Day02(FileReaders fileReaders) {
        this.problemStatus = new HashMap<>();
        this.problemStatus.put("1", ProblemStatusEnum.SOLVED);
        this.problemStatus.put("2", ProblemStatusEnum.SOLVED);
        ids = fileReaders.readFileAsStrArr("input/day2/input");
    }

    Day02(String[] _ids) {
        this.problemStatus = new HashMap<>();
        this.problemStatus.put("1", ProblemStatusEnum.SOLVED);
        this.problemStatus.put("2", ProblemStatusEnum.SOLVED);
        ids = _ids;
    }

    @Override
    public int getDay() {
        return 2;
    }

    @Override
    public HashMap<String, ProblemStatusEnum> getProblemStatus() {
        return problemStatus;
    }

    @Override
    public String firstPart() {
        return "Part 1 - Checksum: " + getChecksum();
    }

    @Override
    public String secondPart() {
        return "Part 2 - CommonLetters: " + findCommonLettersBetweenIds();
    }

    private String getCommonLettersBetweenStrings(String aStr,String bStr) {
        StringBuilder commonLetters = new StringBuilder();
        int diffCount=0;
        for (int k = 0; k < aStr.length(); k++) {
            if (diffCount > 1) {break;}
            if (aStr.substring(k, k + 1).equals(bStr.substring(k, k + 1))) {
                commonLetters.append(aStr, k, k + 1);
            } else { diffCount++; }
        }
        if (diffCount == 1) {return commonLetters.toString();}
        return "";
    }

    private String findCommonLettersBetweenIds() {
        for (int i = 0; i < ids.length; i++) {
            for (int j = i + 1; j < ids.length; j++) {
                String commonLetters=(getCommonLettersBetweenStrings(ids[i],ids[j]));
                if (commonLetters.length()==0) { continue; }
                return commonLetters;
            }
        }
        return "";
    }

    private HashMap<Character, Integer> getCharCountMap(char[] idAsCharArr){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : idAsCharArr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
    /**
     * Primary method for Day 2, Part 1.
     * Calculates the checksum.
     *
     * @return the checksum
     */
    private int getChecksum() {
        int x2=0;
        int x3=0;
        for (String id : ids) {
            HashMap<Character, Integer> map = getCharCountMap(id.toCharArray());
            if (map.containsValue(2)) { x2++; }
            if (map.containsValue(3)) { x3++; }
        }
        return x2*x3;
    }
}
