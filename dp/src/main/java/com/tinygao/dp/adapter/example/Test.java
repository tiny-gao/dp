package com.tinygao.dp.adapter.example;

public class Test {
    public static void main(String[] args) {
        HomeVoltage voltage = new VoltageAdapter(new _5VVoltage());
        Mobile mobile = new Mobile(voltage);
        mobile.getVoltage();
    }
}
