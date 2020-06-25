package org.haffson.adventofcode.days.day06;

import org.haffson.adventofcode.ProblemStatusEnum;
import org.haffson.adventofcode.days.Days;
import org.haffson.adventofcode.utils.FileReaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Implementation for <i>Chronal Coordinates</i>.
 */
@Component
public class Day06 implements Days {
    /**
     * The puzzle status {@code HashMap}
     */
    private final HashMap<String, ProblemStatusEnum> problemStatus;
    private final String[] inputData;
    /**
     * Constructor of Day06.
     *
     *
     *
     * @param fileReaders {@code @Autowired} fileReader
     */
    @Autowired
    Day06(FileReaders fileReaders) {
        this.problemStatus = new HashMap<>();
        this.problemStatus.put("1", ProblemStatusEnum.SOLVED);
        this.problemStatus.put("2", ProblemStatusEnum.UNSOLVED);

        this.inputData = fileReaders.readFileAsStrArr("input/day6/input");
    }

    Day06(String inputFile) {
        this.problemStatus = new HashMap<>();
        this.problemStatus.put("1", ProblemStatusEnum.UNSOLVED);
        this.problemStatus.put("2", ProblemStatusEnum.UNSOLVED);

        FileReaders fileReaders = new FileReaders();
        this.inputData = fileReaders.readFileAsStrArr(inputFile);
    }

    @Override
    public int getDay() {
        return 6;
    }

    @Override
    public HashMap<String, ProblemStatusEnum> getProblemStatus() {
        return problemStatus;
    }

    @Override
    public String firstPart() {
        Area area = new Area(inputData);
        return "Part 1 - largest area not infinite: " + area.getLargestAreaSize();
    }

    @Override
    public String secondPart() {
        return "Part 2 - ";
    }

   /* private Character[] getCoordinatesFromInput(){

    } */


}