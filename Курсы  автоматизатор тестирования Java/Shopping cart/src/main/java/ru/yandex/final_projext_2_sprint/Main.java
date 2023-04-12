package ru.yandex.final_projext_2_sprint;
import ru.yandex.final_projext_2_sprint.model.Food;
import ru.yandex.final_projext_2_sprint.model.Meat;
import ru.yandex.final_projext_2_sprint.model.Apple;
import ru.yandex.final_projext_2_sprint.model.service.ShoppingCart;
import ru.yandex.final_projext_2_sprint.model.constans.Colour;

public class Main {
    // Создать иерархию классов:
    // Food - абстрактный класс с полями:
    /* int amount - колличество продуктов в кг
     double price - цена за единицу товра
     boolean isVegetarian - проверка веганский ли продукт*/
    // Интерфейс Discountable с методом getDiscount
    // Наследники класа Food -> Meat and Apple
    public static void main(String[] args) {
        Food[] products = {
                new Meat (5, 100),
                new Apple (10, 50, Colour.RED),
                new Apple (8,60,Colour.GREEN),
        };
        ShoppingCart shoppingCart = new ShoppingCart(products);
        System.out.println(shoppingCart.getTotalPriceWithOutDiscount());
        System.out.println(shoppingCart.getTotalPriceWithDiscount());
        System.out.println(shoppingCart.getTotalPriceOfVegetarianProductWithOutDiscount());

    }
}
