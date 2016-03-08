package com.tinygao.dp.command;

public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        Command openCommand = new OpenDoorCommand(door);
        Command closeCommand = new CloseDoorCommand(door);
        
        Controller c = new Controller(openCommand);
        c.doCommand();
        
        Controller d = new Controller(closeCommand);
        d.doCommand();
    }
}
