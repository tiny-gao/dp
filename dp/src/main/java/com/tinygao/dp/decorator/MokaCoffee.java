package com.tinygao.dp.decorator;

public class MokaCoffee implements Coffee {
    
    public MokaCoffee() {}
    
    @Override
    public int getPrice() {
       return 500;
    }

    @Override
    public String getName() {
       return "moka coffee";
    }

}
