package com.tinygao.dp.builder;

public class Director {
    private PersonBuilder pb;

    public Director(PersonBuilder pb) {
        super();
        this.pb = pb;
    }
    
    public void createPerson() {
        pb.drawHead();
        pb.drawBody();
        pb.drawHand();
        pb.drawFoot();
    }
   
    
}
