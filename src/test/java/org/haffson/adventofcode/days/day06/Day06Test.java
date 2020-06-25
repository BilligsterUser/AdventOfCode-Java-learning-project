package org.haffson.adventofcode.days.day06;

import org.haffson.adventofcode.utils.FileReaders;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class Day06Test {

//    @MockBean
    private final FileReaders fileReaders = new FileReaders();

    @Test
    public void testGetDay() {
        Day06 day06 = new Day06(fileReaders);
        int expectedResult = 6;
        int actualResult = day06.getDay();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_firstPart_returnsExpectedResult() {
        Day06 day06 = new Day06(fileReaders);
        String expectedResult = "Part 1 - largest area not infinite: 17";
        String actualResult = day06.firstPart();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_firstPart_returnsExpectedResult2() {
        Day06 day06 = new Day06("input/day6/input");
        String expectedResult = "Part 1 - largest area not infinite: 4976";
        String actualResult = day06.firstPart();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_firstPart_returnsExpectedResult3() {
        Day06 day06 = new Day06("input/day6/input2");
        String expectedResult = "Part 1 - largest area not infinite: 4976";
        String actualResult = day06.firstPart();
        Assert.assertEquals(expectedResult, actualResult);
    }
}