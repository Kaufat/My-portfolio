package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CatTests {

    @Test
    public void getSoundShouldReturnValidValue()  {
        //Arrange
        String expectedSound = "Мяу";
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        // Action
        String catSay = cat.getSound();

        //Assert
        assertEquals("cat.getSound вернул невалидное значение", expectedSound, catSay);
    }

}
