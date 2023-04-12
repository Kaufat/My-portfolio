package org.example;


import java.util.Random;
public class Task4 {

    public static int[][][] createArrayWithRandomNumber(int arraySize ) {
        int array[][][]=new int [arraySize][arraySize][arraySize];
        Random randomNumber=new Random();
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length;j++)
            {
                for (int k = 0; j < array.length;j++)
                {
                array[i][j][k] = randomNumber.nextInt();
                }
            }
        }
        return array;
    }

    public static int findSecondMinNumberArrayDiagonal(int[][][] array){
        int arraySize = array.length;
        int minNumber;
        int secondMinNumber ;
        int checkNumber;

        if (arraySize == 1)
        {
            secondMinNumber = array[0][0][0];
        } else
        {
            minNumber = array[0][0][0];
            secondMinNumber = array[0][arraySize - 1][0];

            if (secondMinNumber < minNumber)
            {
                minNumber = array[0][arraySize - 1][0];
                secondMinNumber = array[0][0][0];
            }
             for (int i = 0; i < arraySize; i++) // Первая диагональ
             {
                checkNumber = array[i][i][i];

                if (checkNumber < minNumber )
                {
                    secondMinNumber = minNumber;
                    minNumber = checkNumber;
                } else if(checkNumber > minNumber && checkNumber < secondMinNumber)
                {
                    secondMinNumber = checkNumber;
                }
             }
            for (int i = 0, j = arraySize - 1; i < arraySize; i++, j--) // Вторая диагональ
            {
                checkNumber = array[i][i][j];

                if (checkNumber < minNumber)
                {
                    secondMinNumber = minNumber;
                    minNumber = checkNumber;
                } else if(checkNumber > minNumber && checkNumber < secondMinNumber)
                {
                    secondMinNumber = checkNumber;
                }
            }
            for (int i = 0, j = arraySize - 1; i < arraySize; i++, j--) // Третья диагональ
            {
                checkNumber = array[i][j][i];

                if (checkNumber < minNumber)
                {
                    secondMinNumber = minNumber;
                    minNumber = checkNumber;
                } else if(checkNumber > minNumber && checkNumber < secondMinNumber)
                {
                    secondMinNumber = checkNumber;
                }
            }
            for (int i = 0, j = arraySize - 1; i < arraySize; i++, j--) // Четвертая диагональ
            {
                checkNumber = array[i][j][j];

                if (checkNumber < minNumber)
                {
                    secondMinNumber = minNumber;
                    minNumber = checkNumber;
                } else if(checkNumber > minNumber && checkNumber < secondMinNumber)
                {
                    secondMinNumber = checkNumber;
                }
            }
        }
        return secondMinNumber;
    }
}
