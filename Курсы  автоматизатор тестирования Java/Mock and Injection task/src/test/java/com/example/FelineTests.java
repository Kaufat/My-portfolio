package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTests {

    @Test

    public void eatMeatShouldReturnValidValue() throws Exception {
        //Arrange
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");

        //Action
        List<String> actualFelineFood = new Feline().eatMeat();

        //Assert
        assertEquals("feline.eatMeat вернул не валидные данные", felineFood, actualFelineFood);
    }

    @Test
    public void getFamilyShouldReturnValidValue() {
        //Arrange
        String felineFamily = "Кошачьи";

        //Action
        String felineActualFamily = new Feline().getFamily();

        //Assert
        assertEquals("feline.getFamily вернул невалидное значение", felineFamily, felineActualFamily);
    }

    @Test
    public void getChildrenWithOutParametersShouldReturnValidKittensCount() {
        //Arrange
        int kittensNumber = 1;

        //Action
        int felineKittensNumber = new Feline().getChildren();

        //Assert
        assertEquals("feline.getChildren вернул невалидное значение", kittensNumber, felineKittensNumber);

    }
}
