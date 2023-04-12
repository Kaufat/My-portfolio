package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTask6
{
    public static void main(String[] args)
    {
        Task6 task6 = new Task6();
        task6.addProduct("Тапок", 20);
        task6.addProduct("Помидор", 200);
        task6.addProduct("Перец", 60);
        task6.addProduct("Метла", 15);
        System.out.println(task6.getProducts());


   }

}
