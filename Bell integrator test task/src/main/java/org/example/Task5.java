package org.example;

public class Task5 {
    public static void  fillArrayDiagonalsByNumbers(int arraySize, int[][] array)
    {
        int number;
        for (int i = 0; i < arraySize; i++) // Первая диагональ
        {
            if (arraySize/2 -1 -i >0)
            {
                number = arraySize/2 -1 -i;
            } else if (arraySize/2 -1 -i == 0 || arraySize/2 -1 -i == -1 )
            {
                number = 0;
            } else
            {
                number = (arraySize/2 -1 -i +1) * - 1;
            }
            array[i][arraySize - 1 - i] = number;
        }
        for (int i = 0; i < arraySize; i++) // Вторая диагональ
        {
            if (arraySize/2 -1 -i >0)
            {
                number = arraySize/2 -1 -i;
            } else if (arraySize/2 -1 -i == 0 || arraySize/2 -1 -i == -1 )
            {
                number = 0;
            } else
            {
                number = (arraySize/2 -1 -i +1) * - 1;
            }
            array[i][i] = number;
        }
    }
    public static void fillUpTriangleArrayByNumbers(int arraySize, int[][] array)
    {
        for ( int i = 0 ; i < arraySize; i++) // Верхний треуголник
        {
            if (array[i][i] == 0)
            {
                break;
            }
            for ( int j = 0; j != arraySize - 1 - (i + i); j++)
            {
                array [i][j + i] = array[i][i];
            }
        }
    }
    public static void fillLeftTriangleArrayByNumbers(int arraySize, int[][] array)
    {
        for ( int i = 0 ; i < arraySize; i++) // Левый треугольник
        {
            if (array[i][i] == 0)
            {
                break;
            }
            for ( int j = 0; j != arraySize - 1 - (i + i) ; j++)
            {
                array [j + i][i] = array[i][i];
            }
        }
    }
    public static void fillRightTriangleArrayByNumbers(int arraySize, int[][] array)
    {
        for ( int i = 0 ; i < arraySize; i++) // Правый треугольник
        {
            if (array[arraySize - 1 - i][arraySize - 1 - i] == 0)
            {
                break;
            }
            for ( int j = 0; j  != arraySize - 1 - (i + i); j++)
            {
                array [arraySize - 1 - (j + i)][arraySize - 1 - i] = array[arraySize - 1 - i][arraySize - 1 - i];
            }
        }
    }
    public static void fillDownTriangleArrayByNumbers(int arraySize, int[][] array)
    {
        for ( int i = 0 ; i < arraySize; i++) // Нижний треугольник
        {
            if (array[arraySize - 1 - i][i] == 0)
            {
                break;
            }
            for ( int j = 0; j  != arraySize - 1 - (i + i); j++)
            {
                array [arraySize - 1 - i][arraySize - 1 - (j + i)] = array[arraySize - 1 - i][i];
            }
        }
    }

    public static int [][] createAndFillArrayAccordingToTask(int arraySize){
        int[][] array = new int [arraySize][arraySize];

        fillArrayDiagonalsByNumbers(arraySize, array);
        fillUpTriangleArrayByNumbers(arraySize, array);
        fillLeftTriangleArrayByNumbers(arraySize, array);
        fillRightTriangleArrayByNumbers(arraySize, array);
        fillDownTriangleArrayByNumbers(arraySize, array);

        return array;
    }
    public static void printOutArray(int[][] array){
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++)
        {
            System.out.print("{");
            for (int j = 0; j < arraySize; j++)
            {
               System.out.print(array[i][j]);
            }
            System.out.print("}");
            System.out.println("");
        }
    }
}
