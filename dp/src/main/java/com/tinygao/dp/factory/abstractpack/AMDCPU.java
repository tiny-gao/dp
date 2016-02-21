package com.tinygao.dp.factory.abstractpack;

public  class AMDCPU implements CPU{

    @Override
    public void process() {
        System.out.println("I am amd cpu, run faster than inter");
    }
}
