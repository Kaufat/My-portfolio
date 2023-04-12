package org.example;

import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args){

        Scanner console=new Scanner(System.in);
        System.out.println("Введите целое число больше 0 ");
        int arraySize=console.nextInt();

        while (arraySize <= 0)
        {
            System.out.println("Введено неверное число");
            System.out.println("Введите целое число больше 0 ");
            arraySize=console.nextInt();

        }

        int[][][] array = Task4.createArrayWithRandomNumber(arraySize);

        System.out.println( Task4.findSecondMinNumberArrayDiagonal(array));
    }
}
