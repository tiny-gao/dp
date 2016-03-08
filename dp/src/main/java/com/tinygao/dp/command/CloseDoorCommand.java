package com.tinygao.dp.command;

public class CloseDoorCommand implements Command{

    private Door door;
    public CloseDoorCommand(Door door) {
        this.door = door;
    }
    @Override
    public void doAction() {
        door.closeDoor();
    }

}
