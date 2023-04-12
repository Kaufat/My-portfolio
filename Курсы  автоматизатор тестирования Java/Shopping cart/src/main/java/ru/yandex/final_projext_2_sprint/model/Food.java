package ru.yandex.final_projext_2_sprint.model;

public abstract class Food implements Discountable {
    protected int amount;
    protected  double price;
    protected boolean isVegetarian;
    public double getTotalPrice () {
        return amount * price;
    }
    public boolean isVegetarian () {
        return isVegetarian;
    }
    @Override
    public double getDiscount() {
    return 0;
    }
}
