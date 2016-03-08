package com.tinygao.dp.proxy;

public class Mother implements Personable {

    private Personable person;
    
    public Personable getPerson() {
        return person;
    }

    public void setPerson(Personable person) {
        this.person = person;
    }

    @Override
    public void openDoor() {
        this.person.openDoor();
        System.out.println("I am mom , I can help you open the door");
    }

}
