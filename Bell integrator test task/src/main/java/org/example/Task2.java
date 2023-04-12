package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {

    List<Map<String, String>> employees = new ArrayList<>();


    public void addObjectWithParameters(String name, String age, String workPosition, String salary, List<Map<String, String>> employees) {
        Map<String, String> employee = Map.of("Имя", name,
                "Возраст", age,
                "Должность", workPosition,
                "Зарплата", salary);
        employees.add(employee);
    }


    public List<String> getEmployeeUnder30Names(List<Map<String, String>> employees) {
        return employees.stream()
                .filter((Map<String, String> employee) -> Integer.parseInt(employee.get(new String("Возраст"))) < 30)
                .map(employee -> employee.get(new String("Имя")))
                .collect(Collectors.toList());
    }

    public List<String> getEmployeeWithSalaryInRubles(List<Map<String, String>> employees) {
        return employees.stream()
                .filter((Map<String, String> employee) -> employee.get(new String("Зарплата")).contains("руб"))
                .map(employee -> employee.get(new String("Имя")))
                .collect(Collectors.toList());
    }

    public int getSumAgeOfEmployees(List<Map<String, String>> employees) {
        return employees.stream()
                .map(employee -> employee.get(new String("Возраст")))
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public long getQuantityOfEmployees(List<Map<String, String>> employees) {
        return employees.stream()
                .map(employee -> employee.get(new String("Имя")))
                .count();
    }

    public long getEmployeeAverageAge(List<Map<String, String>> employees) {
        long sumAge = getSumAgeOfEmployees(employees);
        long quantityOfEmployees = getQuantityOfEmployees(employees);

        return sumAge / quantityOfEmployees;
    }
}


/*
    List<String> employeeWithWageInRubles = task2.employees.stream()
            .filter((Map<String, String> employee) -> employee.get(new String ("Зарплата")).contains("руб"))
            .map(employee -> employee.get(new String ("Имя")))
            .collect(Collectors.toList());
        System.out.println(employeeWithWageInRubles);

    int sumAge = task2.employees.stream()
            .map(employee -> employee.get(new String ("Возраст")))
            .mapToInt(Integer::valueOf)
            .sum();

        System.out.println(sumAge);
*/