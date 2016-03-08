package com.tinygao.dp.command;

public class OpenDoorCommand implements Command{
    private Door door;
    public OpenDoorCommand(Door door) {
        this.door = door;
    }
    @Override
    public void doAction() {
        door.openDoor();
    }
}
