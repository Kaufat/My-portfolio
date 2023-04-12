package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    @Override
    public int getChildren() {
        return getChildren(1);
    }

    @Override
    public int getChildren(int kittensCount) {
        return kittensCount;
    }

}
