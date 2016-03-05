package com.tinygao.dp.decorator;

public class Milk extends CoffeeAccessory{
    
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return 50+this.coffee.getPrice();
    }

    @Override
    public String getName() {
       return coffee.getName() + "+milk";
    }
    

}
