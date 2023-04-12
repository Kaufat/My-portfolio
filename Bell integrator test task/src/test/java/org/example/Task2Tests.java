package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;;
import java.util.List;
import java.util.Map;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)

public class Task2Tests {

    private final List<Map<String, String>> expectedListWithMap;
    private final String name_1;
    private final String name_2;
    private final String name_3;
    private final String name_4;
    private final String age_1;
    private final String age_2;
    private final String age_3;
    private final String age_4;
    private final String workPosition_1;
    private final String workPosition_2;
    private final String workPosition_3;
    private final String workPosition_4;
    private final String salary_1;
    private final String salary_2;
    private final String salary_3;
    private final String salary_4;
    private final List <String> expectedListWithEmployeesUnder30Age;
    private final List <String> expectedListWithEmployeesWithRublesSalary;
    private final long expectedEmployeesAverageAge;


    public Task2Tests
            (
            List<Map<String, String>> expectedList,
            String name_1, String name_2,String name_3,
            String name_4, String age_1, String age_2,
            String age_3,  String age_4, String workPosition_1,
            String workPosition_2, String workPosition_3,
            String workPosition_4, String salary_1,
            String salary_2,  String salary_3,
            String salary_4, List <String> expectedListWithEmployeesUnder30Age,
            List <String> expectedListWithEmployeesWithRublesSalary,
            long expectedEmployeesAverageAge
            )
    {
       this.expectedListWithMap = expectedList;
       this.name_1 = name_1;
       this.name_2 = name_2;
       this.name_3 = name_3;
       this.name_4 = name_4;
       this.age_1 = age_1;
       this.age_2 = age_2;
       this.age_3 = age_3;
       this.age_4 = age_4;
       this.workPosition_1 = workPosition_1;
       this.workPosition_2 = workPosition_2;
       this.workPosition_3 = workPosition_3;
       this.workPosition_4 = workPosition_4;
       this.salary_1 = salary_1;
       this.salary_2 = salary_2;
       this.salary_3 = salary_3;
       this.salary_4 = salary_4;
       this.expectedListWithEmployeesUnder30Age = expectedListWithEmployeesUnder30Age;
       this.expectedListWithEmployeesWithRublesSalary = expectedListWithEmployeesWithRublesSalary;
       this.expectedEmployeesAverageAge = expectedEmployeesAverageAge;
    }

    @Parameterized.Parameters

    public static Object[][] getValues()
    {
        List<Map<String,String>> employees_1 = new ArrayList<>();
        Map <String, String> employee_1 = Map.of("Имя","Петр",
                                                 "Возраст", "25",
                                                 "Должность", "Junior tester",
                                                 "Зарплата", "50000 руб");

        Map <String, String> employee_2 = Map.of("Имя","Иван",
                                                 "Возраст", "23",
                                                 "Должность", "Junior tester",
                                                 "Зарплата", "50000 руб");

        Map <String, String> employee_3 = Map.of("Имя","Валерий",
                                                 "Возраст", "30",
                                                 "Должность", "Middle tester",
                                                 "Зарплата", "1500$");

        Map <String, String> employee_4 = Map.of("Имя","Владимир",
                                                 "Возраст", "35",
                                                 "Должность", "Dev ops",
                                                 "Зарплата", "3000$");

        employees_1.add(employee_1);
        employees_1.add(employee_2);
        employees_1.add(employee_3);
        employees_1.add(employee_4);

        List<Map<String,String>> employees_01 = new ArrayList<>();
        Map <String, String> employee_01 = Map.of("Имя","Олеся",
                                                  "Возраст", "26",
                                                  "Должность", "Junior tester",
                                                  "Зарплата", "45500 руб");

        Map <String, String> employee_02 = Map.of("Имя","Алла",
                                                  "Возраст", "29",
                                                  "Должность", "Junior tester",
                                                  "Зарплата", "45500 руб");

        Map <String, String> employee_03 = Map.of("Имя","Инна",
                                                  "Возраст", "33",
                                                  "Должность", "Middle tester",
                                                  "Зарплата", "1750$");

        Map <String, String> employee_04 = Map.of("Имя","Анастасия",
                                                  "Возраст", "39",
                                                  "Должность", "Dev ops",
                                                  "Зарплата", "4300$");

        employees_01.add(employee_01);
        employees_01.add(employee_02);
        employees_01.add(employee_03);
        employees_01.add(employee_04);

        List<String> listEmployeesAgeUnder30_1 = new ArrayList<>();
        listEmployeesAgeUnder30_1.add("Петр");
        listEmployeesAgeUnder30_1.add("Иван");

        List<String> listEmployeesAgeUnder30_2 = new ArrayList<>();
        listEmployeesAgeUnder30_2 .add("Олеся");
        listEmployeesAgeUnder30_2 .add("Алла");

        List<String> listEmployeesWithRublesSalary_1 = new ArrayList<>();
        listEmployeesWithRublesSalary_1.add("Петр");
        listEmployeesWithRublesSalary_1.add("Иван");

        List<String> listEmployeesWithRublesSalary_2 = new ArrayList<>();
        listEmployeesWithRublesSalary_2.add("Олеся");
        listEmployeesWithRublesSalary_2.add("Алла");




        return new Object[][]
                {
                        {employees_1,"Петр","Иван","Валерий","Владимир",
                                     "25","23","30","35",
                                     "Junior tester","Junior tester","Middle tester","Dev ops",
                                     "50000 руб","50000 руб","1500$","3000$",
                        listEmployeesAgeUnder30_1, listEmployeesWithRublesSalary_1, 28},

                        {employees_01,"Олеся","Алла","Инна","Анастасия",
                                     "26","29","33","39",
                                     "Junior tester","Junior tester","Middle tester","Dev ops",
                                     "45500 руб","45500 руб","1750$","4300$",
                        listEmployeesAgeUnder30_2, listEmployeesWithRublesSalary_2, 31},
                };
    }

    @Test
    public void addObjectWithParametersShouldSendValidValue()
    {
        //Arrange
        Task2 task2 = new Task2();
        List<Map<String,String>> actualList = new ArrayList<>();

        //Act
        task2.addObjectWithParameters(name_1, age_1, workPosition_1, salary_1, actualList);
        task2.addObjectWithParameters(name_2, age_2, workPosition_2, salary_2, actualList);
        task2.addObjectWithParameters(name_3, age_3, workPosition_3, salary_3, actualList);
        task2.addObjectWithParameters(name_4, age_4, workPosition_4, salary_4, actualList);

        //Assert
        assertThat(actualList, is(expectedListWithMap));

    }

    @Test
    public  void getEmployeeUnder30NamesShouldReturnValidValue()
        {
            //Arrange
            Task2 task2 = new Task2();
            List<Map<String,String>> actualList = new ArrayList<>();
            task2.addObjectWithParameters(name_1, age_1, workPosition_1, salary_1, actualList);
            task2.addObjectWithParameters(name_2, age_2, workPosition_2, salary_2, actualList);
            task2.addObjectWithParameters(name_3, age_3, workPosition_3, salary_3, actualList);
            task2.addObjectWithParameters(name_4, age_4, workPosition_4, salary_4, actualList);

            //Act
            List<String> actualListWithEmployeesUnder30Age = task2.getEmployeeUnder30Names(actualList);

            //Assert
            assertThat(actualListWithEmployeesUnder30Age, is(expectedListWithEmployeesUnder30Age));
        }

    @Test
    public  void getEmployeeWithSalaryInRublesShouldReturnValidValue()
    {
        //Arrange
        Task2 task2 = new Task2();
        List<Map<String,String>> actualList = new ArrayList<>();
        task2.addObjectWithParameters(name_1, age_1, workPosition_1, salary_1, actualList);
        task2.addObjectWithParameters(name_2, age_2, workPosition_2, salary_2, actualList);
        task2.addObjectWithParameters(name_3, age_3, workPosition_3, salary_3, actualList);
        task2.addObjectWithParameters(name_4, age_4, workPosition_4, salary_4, actualList);

        //Act
        List<String> actualListWithEmployeesWithRublesSalary = task2.getEmployeeWithSalaryInRubles(actualList);

        //Assert
        assertThat(actualListWithEmployeesWithRublesSalary, is(expectedListWithEmployeesWithRublesSalary));
    }


    @Test
    public  void getEmployeeAverageAgeShouldReturnValidValue()
    {
        //Arrange
        Task2 task2 = new Task2();
        List<Map<String,String>> actualList = new ArrayList<>();
        task2.addObjectWithParameters(name_1, age_1, workPosition_1, salary_1, actualList);
        task2.addObjectWithParameters(name_2, age_2, workPosition_2, salary_2, actualList);
        task2.addObjectWithParameters(name_3, age_3, workPosition_3, salary_3, actualList);
        task2.addObjectWithParameters(name_4, age_4, workPosition_4, salary_4, actualList);

        //Act
        long actualEmployeesAverageAge = task2.getEmployeeAverageAge(actualList);

        //Assert
        assertEquals("Метод возвращает средний возраст отличный от ожидаемого", expectedEmployeesAverageAge, actualEmployeesAverageAge);
    }
}

