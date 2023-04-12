package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class Task5Tests
{
    private final int arraySize;
    private final int[][] expectedArray;

    public Task5Tests(int arraySize, int[][] expectedArray)
    {
        this.arraySize = arraySize;
        this.expectedArray = expectedArray;
    }

    @Parameterized.Parameters //Arrange
    public static Object[][] getValues()
    {
        int[][] array0 = {{0,0},
                {0,0}};
        int[][] array1 = {{1,1,1,1},
                {1,0,0,1},
                {1,0,0,1},
                {1,1,1,1}};
        int[][] array2 = {{2,2,2,2,2,2},
                {2,1,1,1,1,2},
                {2,1,0,0,1,2},
                {2,1,0,0,1,2},
                {2,1,1,1,1,2},
                {2,2,2,2,2,2}};
        int[][] array3 = {{3,3,3,3,3,3,3,3},
                {3,2,2,2,2,2,2,3},
                {3,2,1,1,1,1,2,3},
                {3,2,1,0,0,1,2,3},
                {3,2,1,0,0,1,2,3},
                {3,2,1,1,1,1,2,3},
                {3,2,2,2,2,2,2,3},
                {3,3,3,3,3,3,3,3}};
        return new Object[][]
                {
                        {2, array0}, {4, array1},{6, array2},
                        {8, array3},
                };
    }

    @Test
    public void findSecondMinNumberArrayDiagonalShouldReturnValidValue(){
        //ACt
        int[][] actualArray = Task5.createAndFillArrayAccordingToTask(arraySize);

        //Assert
        assertTrue(Arrays.deepEquals(expectedArray, actualArray));
    }
}
