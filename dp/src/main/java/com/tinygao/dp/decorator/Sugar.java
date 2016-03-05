package com.tinygao.dp.decorator;

public class Sugar extends CoffeeAccessory{

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return 70 + this.coffee.getPrice();
    }

    @Override
    public String getName() {
       return coffee.getName() + "+sugar";
    }

}
