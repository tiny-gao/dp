package com.tinygao.dp.decorator;

public class Client {

    public static void main(String[] args) {
        Coffee coffee = new MokaCoffee();
        //加糖的摩卡coffee多少钱?
        coffee = new Sugar(coffee);
        System.out.println(coffee.getName() + ":" +coffee.getPrice());
        
        Coffee coffee2 = new MokaCoffee();
        //加糖加奶的摩卡coffee多少钱？
        coffee2 = new Sugar(coffee2);
        coffee2 = new Milk(coffee2);
        System.out.println(coffee2.getName() + ":" +coffee2.getPrice());
    }
}
