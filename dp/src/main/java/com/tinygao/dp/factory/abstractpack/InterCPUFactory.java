package com.tinygao.dp.factory.abstractpack;

public class InterCPUFactory implements CPUFactory{
    @Override
    public CPU createCPU() {
       return new InterCPU();
    }

}
