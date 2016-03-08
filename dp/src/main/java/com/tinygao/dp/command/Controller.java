package com.tinygao.dp.command;

public class Controller {
    
    private Command command;
    
    public Controller(Command command) {
        super();
        this.command = command;
    }

    public void doCommand() {
        this.command.doAction();
    }

}
