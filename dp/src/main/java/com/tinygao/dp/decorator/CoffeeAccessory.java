package com.tinygao.dp.decorator;

public abstract class CoffeeAccessory  implements Coffee {
    protected Coffee coffee;
    public CoffeeAccessory(Coffee coffee) {
        this.coffee = coffee;
    }
}
