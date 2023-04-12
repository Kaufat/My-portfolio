package org.example;

import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args){

        Scanner console=new Scanner(System.in);
        System.out.println("Введите целое четное число больше или равно 2");
        int arraySize=console.nextInt();

        while (arraySize % 2 != 0)
        {
            System.out.println("Введено неверное число");
            System.out.println("Введите целое четное число больше или равно 2");
            arraySize=console.nextInt();

        }

        int[][] array = Task5.createAndFillArrayAccordingToTask(arraySize);

        Task5.printOutArray(array);
    }
}
