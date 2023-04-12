package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Task3Tests {

    private final int[][] array;
    private final int expectedMinValueArray;

    public Task3Tests(int[][] array, int expectedMinValueArray){
        this.array = array;
        this.expectedMinValueArray = expectedMinValueArray;
    }


    @Parameterized.Parameters //Arrange
    public static Object[][] getValues() {
        int[][] array1 =  {{3,1,3}, {3,1,3},{1,3,3}};
        int[][] array2 =  {{1,2,3,4,5},{1,1,1,1,1},{1,2,0,1,1},{5,3,2,7,8},{7,8,5,4,3}};
        int[][] array3 =  {{3}};
        int[][] array4 =  {{3,1,5,6},{3,1,0,3},{1,3,5,1},{2,2,2,2}};
        int[][] array5 =  {{2,2,2,2,2},{2,2,2,2,2},{2,2,1,2,2},{2,2,2,2,2},{2,2,2,2,2}};
        int[][] array6 =  {{1,1,1,1,1},{1,1,1,0,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int[][] array7 =  {{1,1,1,1,1},{1,1,1,1,1},{1,1,0,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int[][] array8 =  {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,0,1,1,1},{1,1,1,1,1}};
        int[][] array9 =  {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{0,1,1,1,1}};
        return new Object[][]{
                {array1, 1}, {array2, 1}, {array3, 3},
                {array4, 0}, {array5, 2}, {array6, 0},
                {array7, 1}, {array8, 0}, {array9, 0},
        };
    }

    @Test
    public void findMinNumberFromArrayNotCountCrossDiagonalNumberShouldReturnValidValue(){
        //Act
        int actualMinValueArray = Task3.findMinNumberFromArrayNotCountCrossDiagonalNumber(array);

        //Assert
        assertEquals("Метод возвращает не валидный ответ", expectedMinValueArray, actualMinValueArray);
    }
}
