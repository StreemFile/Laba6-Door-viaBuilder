package com.company;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        DoorBuilder builder = new DoorBuilder();
        director.constructMetalDoor(builder);

        Door myDoor2 = builder.build();
        System.out.println(myDoor2.toString());
        System.out.println(myDoor2.getPrice());
    }
}
