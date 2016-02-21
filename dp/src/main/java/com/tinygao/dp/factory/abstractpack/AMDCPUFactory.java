package com.tinygao.dp.factory.abstractpack;

public class AMDCPUFactory implements CPUFactory{

    @Override
    public CPU createCPU() {
       return new AMDCPU();
    }

}
