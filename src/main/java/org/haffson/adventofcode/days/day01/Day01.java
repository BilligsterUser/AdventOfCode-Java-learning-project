package org.haffson.adventofcode.days.day01;

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
public class Day01 implements Days {

    /**
     * The puzzle status {@code HashMap}
     */
    private final HashMap<String, ProblemStatusEnum> problemStatus;
    /**
     * The frequencies {@code Integer[]}
     */
    private final Integer[] frequencies;

    /**
     * Causes the input file to be parsed into the frequencies array ({@code frequencies}).
     *
     * @param fileReaders {@code @Autowired} fileReader //TODO: inject what you need
     */
    @Autowired
    Day01(FileReaders fileReaders) {
        this.problemStatus = new HashMap<>();
        this.problemStatus.put("1", ProblemStatusEnum.SOLVED);
        this.problemStatus.put("2", ProblemStatusEnum.SOLVED);

        // frequencies = new int[]{+1, -2, +3, +1}
        // frequencies = new int[]{+1, +1, -2};
        // frequencies = new int[]{-1, -2, -3};
        frequencies = fileReaders.readFileAsIntArr("input/day1/input");
    }

    Day01(Integer[] _frequencies) {
        this.problemStatus = new HashMap<>();
        this.problemStatus.put("1", ProblemStatusEnum.SOLVED);
        this.problemStatus.put("2", ProblemStatusEnum.SOLVED);

        frequencies = _frequencies;
    }

    @Override
    public int getDay() {
        return 1;
    }

    @Override
    public HashMap<String, ProblemStatusEnum> getProblemStatus() {
        return problemStatus;
    }

    @Override
    public String firstPart() {
        return "Part 1 - Frequency: " + calculateFrequency();
    }

    @Override
    public String secondPart() {
        return "Part 2 - Frequency: " + calcPart2();
    }

    public Integer calcPart2() {
        Set<Integer> ints = new HashSet<Integer>();
        Integer result = 0;
        ints.add(result);
        for (int i = 0; true; i++) {
            if (frequencies.length==i){i=0;}
            result += frequencies[i];
            if (!ints.add(result)){return result; }
        }
    }

    /**
     * Primary method for Day 1, Part 1.
     * Calculates the final frequency as the sum of all frequencies.
     *
     * @return the final frequency
     */
    private int calculateFrequency() {
        int result = 0;
        for (int i = 0; i < frequencies.length; i++) {
            result += frequencies[i];
        }
        return result;
    }
}
