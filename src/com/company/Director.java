package com.company;

/**
 * Created by IntelliJ IDEA.
 * Laba 6.Director
 *
 * @Autor: vovamv
 * @DateTime: 10/29/20|11:37 пп
 * @Version Director: 1.0
 */

public class Director {
    public void constructWoodenDoor(DoorBuilder builder){
        builder.setDoorHeight(220);
        builder.setDoorWidth(130);
        builder.setMaterial("wooden");
        builder.setColor("brown");
        builder.setLockType("mortise");
        builder.setHasWindow(false);
    }
    public void constructMetalDoor(DoorBuilder builder){
        builder.setDoorHeight(220);
        builder.setDoorWidth(130);
        builder.setMaterial("metal");
        builder.setColor("black");
        builder.setLockType("electromechanical");
        builder.setHasWindow(false);
    }
    public void constructPlasticDoor(DoorBuilder builder){
        builder.setDoorHeight(220);
        builder.setDoorWidth(130);
        builder.setMaterial("plastic");
        builder.setColor("white");
        builder.setLockType("mortise");
        builder.setHasWindow(false);
    }
}
