package com.tinygao.dp.bridge;

public class Client {
    public static void main(String[] args) {
        ITV itv = new SonyTV();
        AbstractRemoteController a = new LogitRemoteController(itv);
        a.controllerTurnOff();
        a.controllerTurnOn();
    }
}
