package com.tinygao.dp.factory.abstractpack;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpuFactory(new InterCPUFactory());
        computer.runProcess();
    }
}
