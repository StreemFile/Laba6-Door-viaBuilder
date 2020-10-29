package com.company;

public interface IDoorBuilder {
    void setDoorHeight(double height);
    void setDoorWidth(double width);
    void setMaterial(String material);
    void setColor(String color);
    void setLockType(String lockType);
    void setHasWindow(boolean hasWindow);
    Door build();
}

