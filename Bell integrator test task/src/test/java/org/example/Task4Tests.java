package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Task4Tests {

    private final int[][][] array;
    private final int expectedSecondMinValueArray;

    public Task4Tests(int[][][] array, int expectedMinValueArray){
        this.array = array;
        this.expectedSecondMinValueArray = expectedMinValueArray;
    }


    @Parameterized.Parameters //Arrange
    public static Object[][] getValues() {
        int[][][] array1 = {{{15}}};
        int[][][] array2 = {{{1,3},{3,3}},{{3,3},{3,2}}};
        int[][][] array3 = {{{3,1},{3,3}},{{3,3},{2,3}}};
        int[][][] array4 = {{{3,3},{1,3}},{{3,2},{3,3}}};
        int[][][] array5 = {{{3,3},{3,1}},{{2,3},{3,3}}};
        int[][][] array6 = {{{2,3},{3,1}},{{2,3},{3,1}}};
        int[][][] array7 = {{{1,3,3},{3,3,3},{3,3,3}}, {{3,3,3},{3,2,3},{3,3,3}}, {{3,3,3},{3,3,3},{3,3,3}}};
        int[][][] array8 = {{{3,3,3},{3,3,3},{3,3,3}}, {{3,3,3},{3,2,3},{3,3,3}}, {{3,3,3},{3,3,3},{3,3,1}}};
        int[][][] array9 = {{{2,3,3},{3,3,3},{3,3,3}}, {{3,3,3},{3,1,3},{3,3,3}}, {{3,3,3},{3,3,3},{3,3,3}}};
        int[][][] array10 = {{{3,3,1},{3,3,3},{3,3,3}}, {{3,3,3},{3,2,3},{3,3,3}}, {{3,3,3},{3,3,3},{3,3,3}}};
        int[][][] array11 = {{{3,3,3},{3,3,3},{1,3,3}}, {{3,3,3},{3,2,3},{3,3,3}}, {{3,3,3},{3,3,3},{3,3,3}}};
        int[][][] array12 = {{{3,3,3},{3,3,3},{3,3,1}}, {{3,3,3},{3,2,3},{3,3,3}}, {{3,3,3},{3,3,3},{3,3,3}}};
        int[][][] array13 = {{{1,3,3},{3,3,3},{3,3,2}}, {{3,3,3},{3,1,3},{3,3,3}}, {{3,3,3},{3,3,3},{3,3,3}}};
        int[][][] array14 = {{{3,3,3},{3,3,3},{3,3,3}}, {{3,3,3},{3,2,3},{3,3,3}}, {{1,3,3},{3,3,3},{3,3,3}}};
        int[][][] array15 = {{{1,3,3},{3,3,3},{3,3,3}}, {{3,3,3},{3,2,3},{3,3,3}}, {{3,3,3},{3,3,3},{3,3,1}}};
        int[][][] array16 = {{{1,3,3},{3,3,3},{3,3,3}}, {{3,3,3},{3,2,3},{3,3,3}}, {{3,3,3},{3,3,3},{1,3,3}}};
        int[][][] array17 = {{{1,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3}},
                {{3,3,3,3,3},{3,2,3,3},{3,3,3,3,3},{3,3,3,3,3}},
                {{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3}},
                {{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3}}};
        int[][][] array18 = {{{1,1},{3,3}},{{3,3},{3,3}}};

        return new Object[][]{
                {array1, 15}, {array2, 2}, {array3, 2}, {array4, 2},
                {array5, 2}, {array6, 2}, {array7, 2}, {array8, 2},
                {array9, 2}, {array10, 2}, {array11, 2}, {array12, 2},
                {array13, 2}, {array14, 2}, {array15, 2}, {array16, 2},
                {array17, 2}, {array18, 3},
        };
    }

    @Test
    public void findSecondMinNumberArrayDiagonalShouldReturnValidValue(){
        //Act
        int actualSecondMinValueArray = Task4.findSecondMinNumberArrayDiagonal(array);

        //Assert
        assertEquals("Метод возвращает не валидный ответ", expectedSecondMinValueArray, actualSecondMinValueArray);
    }
}