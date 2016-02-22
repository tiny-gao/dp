package com.tinygao.dp.builder;

public class Client {

    public static void main(String[] args) {
        PersonBuilder fpb = new FatPersonBuilder();
        Director d = new Director(fpb);
        d.createPerson();
    }
}
