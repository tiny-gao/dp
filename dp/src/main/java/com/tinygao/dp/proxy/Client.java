package com.tinygao.dp.proxy;

public class Client {

    public static void main(String[] args) {
        Personable ps = new Baby();
        Mother mom = new Mother();
        mom.setPerson(ps);
        mom.openDoor();
    }
}
