package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

@RunWith(Parameterized.class)
public class LionParameterizedTests {

    private final String sex;
    private final boolean doesHasMane;
    private final List<String> mockFood;
    private final int kittensNumber;

    public LionParameterizedTests (List<String> mockFood, String sex, boolean doesHasMane, int kittensNumber){
        this.mockFood = mockFood;
        this.sex = sex;
        this.doesHasMane = doesHasMane;
        this.kittensNumber = kittensNumber;
    }

    @Parameterized.Parameters //Arrange
    public static Object[][] getValues() {
        return new Object[][]{
                { List.of ("Соль", "Перец", "Мыло"), "Самец", true, 3},
                { List.of ("Мандарин", "Персик", "Дерево"), "Самка", false, 4},
                { List.of ("чипсы", "Кола", "Пиво"), "Самец", true, 5},
        };
    }

    @Test
    public void doesHasManeReturnValidValue() throws Exception {
        //Action
        Lion lion = new Lion(sex);

        //Assert
        assertEquals("lion.doesHasMane возвращает невалидные данные", doesHasMane, lion.doesHaveMane());

    }

    @Test
    public void getFoodShouldReturnFelineEatMeat() throws Exception {
        //Arrange
        Feline mockFeline = mock();
        Mockito.when( mockFeline.eatMeat()).thenReturn(mockFood);
        Lion lionWithMock = new Lion(mockFeline);

        //Action
        List<String> lionFoods = lionWithMock.getFood();

        //Assert
        Mockito.verify(mockFeline, times(1)).eatMeat();
        assertEquals("cat.getFood вернул отличный от feline.eatMeat результат", mockFood, lionFoods);
    }

    @Test
    public void getKittensShouldReturnValidKittensNumber() {
        //Arrange
        Feline mockFeline = mock();
        Mockito.when( mockFeline.getChildren()).thenReturn(kittensNumber);
        Lion lionWithMock = new Lion(mockFeline);

        //Action
        int lionKittensNumber = lionWithMock.getKittens();

        //Assert
        Mockito.verify(mockFeline, times(1)).getChildren();
        assertEquals("cat.getFood вернул отличный от feline.eatMeat результат", kittensNumber, lionKittensNumber);
    }

}
