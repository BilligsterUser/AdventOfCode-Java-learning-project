package org.haffson.adventofcode.days.day01;

import org.haffson.adventofcode.utils.FileReaders;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class Day01Test {

   /* @MockBean
    private FileReaders fileReaders;

    @Test
    public void testGetDay() {
        Day01 day01 = new Day01(fileReaders);
        int expectedResult = 1;
        int actualResult = day01.getDay();
        Assert.assertEquals(expectedResult, actualResult);
    }*/

    @Test
    public void testGetDay() {
        Day01 day01 = new Day01(new Integer[0]);
        int expectedResult = 1;
        int actualResult = day01.getDay();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFileReaders_readFile() {
        String expectedResult = "-1,-2,-3";
        String actualResult = FileReaders.readFile("input/day1/3");
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFileReaders_strToIntArr() {
        String inputStr = "-1,-2,-3";
        Integer[] expectedResult = new Integer[]{-1,-2,-3};
        Integer[] actualResult = FileReaders.strToIntArr(inputStr);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testFileReaders_strToIntArrWin() {
        String inputStr = "-1\r\n-2\r\n-3";
        Integer[] expectedResult = new Integer[]{-1,-2,-3};
        Integer[] actualResult = FileReaders.strToIntArr(inputStr);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testFileReaders_strToIntArrUnix() {
        String inputStr = "-1\n-2\n-3";
        Integer[] expectedResult = new Integer[]{-1,-2,-3};
        Integer[] actualResult = FileReaders.strToIntArr(inputStr);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void test_firstPart_returnsExpectedResult2() {
        Integer[] intArr=new Integer[]{+1, -2, +3, +1};
        Day01 day01 = new Day01(intArr);

        String expectedResult = "Part 1 - Frequency: " + 3;

        //act
        String actualResult = day01.firstPart();

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_firstPart_returnsExpectedResult3() {
        Integer[] intArr=new Integer[]{+1, +1, -2};
        Day01 day01 = new Day01(intArr);

        String expectedResult = "Part 1 - Frequency: " + 0;

        //act
        String actualResult = day01.firstPart();

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_firstPart_returnsExpectedResult4() {
        Integer[] intArr=new Integer[]{-1, -2, -3};
        Day01 day01 = new Day01(intArr);

        String expectedResult = "Part 1 - Frequency: " + -6;

        //act
        String actualResult = day01.firstPart();

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
