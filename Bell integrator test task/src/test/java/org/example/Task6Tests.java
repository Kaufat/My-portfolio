package org.example;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;


@RunWith(Enclosed.class)
public class Task6Tests
{
    @RunWith(Parameterized.class)
    public static class TheParameterizedPart
    {

        private final int expectedProductNumber;
        private final String productName;


    public TheParameterizedPart(int expectedProductNumber, String productName)
        {
            this.expectedProductNumber = expectedProductNumber;
            this.productName=productName;
        }


        @Parameterized.Parameters
        public static Object[][] getValues() {

        return new Object[][]{
                {20, "Тапки"}, {40, "Лампочки"}, {5, "Холодильник"},

        };
    }

        @Test
        public void getProductQuantityShouldReturnValidQuantity()
        {
            //Arrange
            Task6 task6 = new Task6();
            task6.addProduct(productName, expectedProductNumber);

            //Act
            int actualProductNumber = task6.getProductQuantity(productName);
            //Assert
            assertEquals("Метод возвращает не валидный ответ", expectedProductNumber, actualProductNumber);
        }
    }

    public static class NotparameterizedPart
    {
        @Test
        public void  removeProductShouldRemoveProductFromTable()
        {
            //Arrange
            Task6 task6 = new Task6();
            task6.addProduct("Виски", 5);
            task6.addProduct("Кола", 6);
            task6.addProduct("Спрайт", 8);
            task6.addProduct("Вино", 9);
            List<String> expectedProductList= List.of("Виски","Кола","Вино");

            //Act
            task6.removeProduct("Спрайт");
            List<String> actualProductList = task6.getProducts();

            //Assert
            assertEquals("removeProduct Не удалил товар из таблицы",expectedProductList.size(), actualProductList.size());
            assertTrue("removeProduct Не удалил товар из таблицы",expectedProductList.containsAll(actualProductList));


        }

        @Test
        public void clearShouldClearTable()
        {
            //Arrange
            Task6 task6 = new Task6();
            task6.addProduct("Виски", 5);
            task6.addProduct("Кола", 6);
            task6.addProduct("Спрайт", 8);
            task6.addProduct("Вино", 9);
            List<String> expectedProductList= List.of();

            //Act
            task6.clear();
            List<String> actualProductList = task6.getProducts();

            //Assert
            assertEquals("removeProduct Не удалил товар из таблицы",expectedProductList.size(), actualProductList.size());
            assertTrue("removeProduct Не удалил товар из таблицы",expectedProductList.containsAll(actualProductList));
        }

        @Test
        public void updateProductQuantityShouldUpdateProductInTable()
        {
            //Arrange
            Task6 task6 = new Task6();
            task6.addProduct("Виски", 5);
            task6.addProduct("Кола", 6);
            task6.addProduct("Спрайт", 8);
            task6.addProduct("Вино", 9);
            int expectedProductNumber = 7;

            //Act
            task6.addProduct("Кола", 7);
            int actualProductNumber = task6.getProductQuantity("Кола");

            //Assert
            assertEquals("updateProductQuantity не обнвоил колличество товара в таблице", expectedProductNumber, actualProductNumber);
        }

        @Test
        public void  getProductQuantityShouldReturnZeroInCaseOfEmptyCart()
        {
            //Arrange
            Task6 task6 = new Task6();
            int expectedNumber= 0;

            //Act
            int actualNumber = task6.getProductQuantity("Кола");

            //Assert
            assertEquals("getProductQuantity не вернул 0",expectedNumber, actualNumber);

        }

        @Test
        public void  addProductShouldReturnValidValueInCaseOfMultiplyInputTheSameValue()
        {
            //Arrange
            Task6 task6 = new Task6();
            task6.addProduct("Вино", 9);
            task6.addProduct("Вино", 9);
            task6.addProduct("Вино", 9);
            task6.addProduct("Вино", 9);
            task6.addProduct("Вино", 9);
            task6.addProduct("Вино", 9);
            int expectedNumber= 54;

            //Act
            int actualNumber = task6.getProductQuantity("Вино");

            //Assert
            assertEquals("getProductQuantity должен возвращать валидное значение",expectedNumber, actualNumber);

        }

    }
}