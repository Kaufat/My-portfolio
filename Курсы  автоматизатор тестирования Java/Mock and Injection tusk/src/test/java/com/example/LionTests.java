package com.example;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class LionTests {

    @Test
    public void constructorLionShouldThrowExceptionInCaseInvalidSexValue() {
        //Arrange
        String exceptionValue = "Лев";

        //Assert
        Exception exception = Assert.assertThrows("Проверка exception", Exception.class, () ->  new Lion (exceptionValue));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}
