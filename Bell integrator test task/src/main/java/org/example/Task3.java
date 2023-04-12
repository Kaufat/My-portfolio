package org.example;

import java.util.Random;

public class Task3 {


    public static int[][] createArrayWithRandomNumber(int arraySize ) {
        int array[][]=new int [arraySize][arraySize];
        Random randomNumber=new Random();
        for (int i=0; i<array.length; i++)
        {
            for (int j=0; j<array[i].length;j++)
            {
                array[i][j] = randomNumber.nextInt();
            }
        }
        return array;
    }

    public static int findMinNumberFromArrayNotCountCrossDiagonalNumber(int[][] array ) {
        int arraySize = array.length;
        int minNumber = array[0][arraySize - 1];
        int arrayDiagonalCrossValue = arraySize / 2;

        if (arraySize % 2 == 0)
        {
            for (int i = 0; i < arraySize; ++i)
            {
                if (array[i][arraySize - 1 - i] < minNumber) {
                    minNumber = array[i][arraySize - 1 - i];
                }
            }
        } else
        {
            for (int j = 0; j < arraySize; ++j)
            {
                if (j == arrayDiagonalCrossValue) { continue;}
                if (array[j][arraySize - 1 - j] < minNumber) {
                minNumber = array[j][arraySize - 1 - j];
                }
            }
        }


        return minNumber;
    }
}


