package com.tinygao.dp.factory.abstractpack;

public class Computer {

    private CPU cpu;
    private CPUFactory cpuFactory;
    
    public void runProcess() {
        this.cpu = this.cpuFactory.createCPU();
        this.cpu.process();
    }

    public CPUFactory getCpuFactory() {
        return cpuFactory;
    }

    public void setCpuFactory(CPUFactory cpuFactory) {
        this.cpuFactory = cpuFactory;
    }
    
}
