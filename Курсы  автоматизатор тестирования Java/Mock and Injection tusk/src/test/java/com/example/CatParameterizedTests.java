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
public class CatParameterizedTests {

    private final List<String> mockFood;

    public CatParameterizedTests(List<String> mockFood){
        this.mockFood = mockFood;
    }

    @Parameterized.Parameters //Arrange

    public static Object[][] getValues() {
        return new Object[][]{
                { List.of ("Соль", "Перец", "Мыло")},
                { List.of ("Мандарин", "Персик", "Дерево")},
                { List.of ("чипсы", "Кола", "Пиво")},
        };
    }

    @Test
    public void getFoodShouldReturnFelineEatMeat() throws Exception {
        //Arrange
        Feline mockFeline = mock();
        Mockito.when( mockFeline.eatMeat()).thenReturn(mockFood);
        Cat catWithMock = new Cat(mockFeline);

        //Action
        List<String> catFoods = catWithMock.getFood();

        //Assert
        Mockito.verify(mockFeline, times(1)).eatMeat();
        assertEquals("cat.getFood вернул отличный от feline.eatMeat результат", mockFood, catFoods);
    }
}
