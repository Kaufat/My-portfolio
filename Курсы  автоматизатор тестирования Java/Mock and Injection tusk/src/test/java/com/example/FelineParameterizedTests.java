package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineParameterizedTests {

    private final int kittensCount;

    public FelineParameterizedTests (int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters //Arrange

    public static Object[][] getValues() {
        return new Object[][]{
                { 1 },
                { 5 },
                { 8 },
        };
    }

    @Test
    public void getChildrenWithParametersShouldReturnValidKittensCount() {

        //Action
        int felineKittensNumber = new Feline().getChildren(kittensCount);

        //Assert
        assertEquals("feline.getChildren вернул невалидное значение", kittensCount, felineKittensNumber);

    }
}
