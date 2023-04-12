package ru.yandex.final_projext_2_sprint.model.service;
import ru.yandex.final_projext_2_sprint.model.Food;

public class ShoppingCart  {
    private Food[] products;
    public ShoppingCart (Food[] products) {
        this.products = products;
    }
    public Food[] getProducts(){
        return products;
    }
    public void setProducts(Food[] products){
        this.products = products;
    }
    public double getTotalPriceWithOutDiscount (){
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += (products[i].getTotalPrice());
        }
        return totalPrice;
    }
    public double getTotalPriceWithDiscount (){
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += (products[i].getTotalPrice()- (products[i].getDiscount()/100 *products[i].getTotalPrice()));
        }
        return totalPrice;
    }
    public double getTotalPriceOfVegetarianProductWithOutDiscount (){
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].isVegetarian()) {
                totalPrice += (products[i].getTotalPrice());
            }
        }
        return totalPrice;
    }
}
