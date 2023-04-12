package org.example;

public class MainTask2
{
    public static void main (String[] args)
    {
        Task2 task2 = new Task2();
        task2.addObjectWithParameters("Кирилл", "26", "Middle java dev", "150000 руб", task2.employees);
        task2.addObjectWithParameters("Виталий", "28", "Senior java automation QA", "2000$", task2.employees);
        task2.addObjectWithParameters("Александр", "31", "junior functional tester", "50000 руб",task2.employees);
        task2.addObjectWithParameters("Дементий", "35", "dev-ops", "1500$", task2.employees);
        System.out.println(task2.getEmployeeUnder30Names(task2.employees));
        System.out.println(task2.getEmployeeWithSalaryInRubles(task2.employees));
        System.out.println(task2.getEmployeeAverageAge(task2.employees));

    }
}

