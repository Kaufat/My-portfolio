package ru.yandex.final_projext_2_sprint.model;
import ru.yandex.final_projext_2_sprint.model.constans.Colour;
import ru.yandex.final_projext_2_sprint.model.constans.Discount;
public class Apple extends Food {
    private String colour;
    public Apple (int amount, double price,  String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        return (colour.equals(Colour.RED))? Discount.RED_APPLE_DISCOUNT : 0;
    }
}
